SUMMARY = "EditorConfig Core support for the Lua language"
DESCRIPTION = "EditorConfig makes it easy to maintain the correct coding \
style when switching between different text editors \
and betweendifferent projects. The EditorConfig project \
maintains a file format and plugins for various text editors \
which allow this file format to be read and used by those \
editors. EditorConfig Lua Core provides the same functionality \
as the Editorconfig C Core library."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "lua54-editorconfig-core-lua-0.3.0-7.3.aarch64.rpm"
RPM_HASH = "bf51776252722ee25cb41630d51c3a8d7613315ea910684d5c8cb0c6bebfe23d1f386601f50ce5acc8203224b4b10241d0b4aa243f4e737a823b674ca6687cd8"

RPROVIDES:${PN} += "lua-editorconfig-core-lua \
lua54-LPeg \
lua54-editorconfig-core-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeditorconfig.so.0 \
lua54"

inherit rpm
