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

RPM_NAME = "lua53-luaepnf-0.3+git19-5.2.noarch.rpm"
RPM_HASH = "81065cbceadd6b387bd921238ac42817902d8de34c78eaf66e516a72385c7cdca05c800f85695964d5e2d9cbf6c87799386a674aa9d4574d58f505a7ae63881b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luaepnf"

RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
