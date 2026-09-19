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

RPM_NAME = "lua55-editorconfig-core-lua-0.3.0-7.3.aarch64.rpm"
RPM_HASH = "d674a549fc055d2470336cec4bc09e5d6c9c249ade97219daebaadbef2708cc401b23ceb9aa1652a698885893d52f0b82a43772ae09563881e434364c560190b"

RPROVIDES:${PN} += "lua55-LPeg \
lua55-editorconfig-core-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeditorconfig.so.0 \
lua55"

inherit rpm
