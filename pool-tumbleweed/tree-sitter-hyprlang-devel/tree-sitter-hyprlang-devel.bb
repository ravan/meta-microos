SUMMARY = "Devel package for tree-sitter-hyprlang containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "tree-sitter-hyprlang-devel-3.1.0-2.4.noarch.rpm"
RPM_HASH = "adc3b0237170807c360cefa65a5266a3f80c7745c409d8641b984c49596234750c43fded50bede37aebaeaba136cc0880d37583653c2b0dbf8a9fee466f2a197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-hyprlang-devel \
treesitter-grammar-src-tree-sitter-hyprlang"

RDEPENDS:${PN} += ""

inherit rpm
