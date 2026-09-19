SUMMARY = "Tool for exploring Game of Life and other automata"
DESCRIPTION = "Key features: \
- Supports both bounded and unbounded universes. \
- Supports various topologies (plane, torus, Klein bottle, etc.). \
- Supports multi-state universes (cells can have up to 256 states). \
- Includes the QuickLife algorithm. \
- Uses the HashLife algorithm to see large patterns evolve at huge time scales. \
- Supports many different rules, including Wolfram's 1D rules, WireWorld, Generations, and John von Neumann's 29-state CA. \
- Uses the RuleLoader algorithm to load custom rules. \
- Reads RLE, macrocell, Life 1.05/1.06, dblife, and MCell files. \
- Can also read common graphic formats: BMP, PNG, GIF, TIFF. \
- Can extract patterns, scripts and rules from zip files. \
- Downloads files from online archives. \
- Includes a pattern collection. \
- Paste in patterns from the clipboard. \
- Unlimited undo/redo. \
- Unbounded zooming out for astronomical patterns. \
- Auto fit option keeps a generating pattern within view. \
- Full screen option (no menu/status/tool/scroll bars). \
- Supports multiple layers, including cloned layers. \
- HTML-based help with an integrated Life Lexicon. \
- Scriptable via Lua or Python. \
- User-configurable keyboard shortcuts."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "golly-5.0-2.1.aarch64.rpm"
RPM_HASH = "ce0619503fe05ad237da6eed523cf8385079e28c8a6865e14b90dcbb7bd51a9c823d92f86dcd4c9666d5ca3e13bde342f67c268353af63584c18fa71b1a7051b"

RPROVIDES:${PN} += "golly"

RDEPENDS:${PN} += "golly-assets \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libz.so.1 \
python3"

inherit rpm
