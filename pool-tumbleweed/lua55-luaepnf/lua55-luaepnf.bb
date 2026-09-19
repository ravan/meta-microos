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

RPM_NAME = "lua55-luaepnf-0.3+git19-5.2.noarch.rpm"
RPM_HASH = "6fd5dc280e2e86d429a67547d408c8a5a244db4e726f9a6be04347634ae88f8d27d2f6ab4feac8cbc32af4775d09e5ab78528b2e05817e5f490389596ac9bed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luaepnf"

RDEPENDS:${PN} += "lua55 \
lua55-lpeg"

inherit rpm
