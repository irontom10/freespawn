#!/usr/bin/env bash
set -euo pipefail

MODID="freespawn"
TEX_DIR="src/main/resources/assets/${MODID}/textures/item"
MODEL_DIR="src/main/resources/assets/${MODID}/models/item"

rm -rf "$MODEL_DIR"

# 1) Ensure models directory exists
mkdir -p "$MODEL_DIR"

# 2) Rename files: collapse multiple underscores into one
echo "✂️  Collapsing underscores in texture filenames…"
for src in "$TEX_DIR"/*; do
  # if it’s not a file, skip
  [[ -f "$src" ]] || continue

  dst="$(dirname "$src")/$(basename "$src" | sed -E 's/_+/_/g')"
  if [[ "$src" != "$dst" ]]; then
    echo "  → $(basename "$src")  →  $(basename "$dst")"
    mv -i "$src" "$dst"
  fi
done

# 3) Generate one model JSON per PNG
echo "🖼️  Generating item model JSONs…"
for png in "$TEX_DIR"/*.png; do
  name="$(basename "$png" .png)"
  json="$MODEL_DIR/${name}.json"

  cat > "$json" << EOF
{
  "parent": "item/generated",
  "textures": {
    "layer0": "${MODID}:item/${name}"
  }
}
EOF

  echo "  • Created $(basename "$json")"
done

echo "✅ Done! All textures cleaned and model files generated."

