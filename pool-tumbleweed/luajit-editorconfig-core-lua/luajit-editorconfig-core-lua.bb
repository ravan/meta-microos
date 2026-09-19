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

RPM_NAME = "luajit-editorconfig-core-lua-0.3.0-7.3.aarch64.rpm"
RPM_HASH = "97e26b16797965e95176ac0ab716a4d60eb3a1c47b10a592eeed5d02452c1c4cfca89f64ec3cf2ced8bdd1be45d0bd8455902d79b3a1829ff2d7c4846cf0a4d7"

RPROVIDES:${PN} += "luajit-LPeg \
luajit-editorconfig-core-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeditorconfig.so.0 \
luajit"

inherit rpm
