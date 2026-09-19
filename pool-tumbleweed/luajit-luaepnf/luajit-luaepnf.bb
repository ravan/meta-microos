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

RPM_NAME = "luajit-luaepnf-0.3+git19-5.2.noarch.rpm"
RPM_HASH = "bbbc344abc86a0d5bf92e618df384ef42292f2af8206daac8dea1c1afe09e8bc6c5710e5f3b78c671fed979e9dbde13ac7f54826284b3cd30f253b8489c4d7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-luaepnf"

RDEPENDS:${PN} += "luajit \
luajit-lpeg"

inherit rpm
