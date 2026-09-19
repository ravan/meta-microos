SUMMARY = "Extended PEG Notation Format (easy grammars for LPeg)"
DESCRIPTION = "The LPeg library is a powerful tool to parse text and extract parts of \
it using captures. It even provides grammars, which can be used to \
parse non-regular languages, but the complexer the language gets, the \
more difficult error handling and keeping track of captured information \
becomes. luaepnf enhances usage of LPeg grammars by building an abstract \
syntax tree (AST) for the input and providing tools for error reporting, \
as well as offering syntax sugar and shortcuts for accessing LPeg's features."
LICENSE = "MIT"

PV = "0.3+git19"

RPM_NAME = "lua54-luaepnf-0.3+git19-5.2.noarch.rpm"
RPM_HASH = "31133ab84c56e5b2f081f44eb3f6162e5092d3c6a2c25d423616d15906dc713423c3b91c93263e4cbee5e63324217a2edb4a42e86689d7fae92c0cf61fd7cfb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luaepnf \
lua54-luaepnf"

RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm
