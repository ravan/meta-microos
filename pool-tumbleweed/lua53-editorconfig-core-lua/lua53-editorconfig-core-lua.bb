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

RPM_NAME = "lua53-editorconfig-core-lua-0.3.0-7.3.aarch64.rpm"
RPM_HASH = "65bea8cf36cd6f9b9880d816ea1dd8d2627507718e7af5c9fdb580161bbf78ccd30bbc471fd545906015ad07a2e9d37a9d42fe46d41f6a6765c317ffeb29c7b6"

RPROVIDES:${PN} += "lua53-LPeg \
lua53-editorconfig-core-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeditorconfig.so.0 \
lua53"

inherit rpm
