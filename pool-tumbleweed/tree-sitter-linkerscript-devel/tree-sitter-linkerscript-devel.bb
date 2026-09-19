SUMMARY = "Devel package for tree-sitter-linkerscript containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-linkerscript-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "f0b2600db793f9d0bbc47825585f2cf9d1b3451db27624b758db3a7f8be1289131d9aedf8e561572d4bb0c5fb2f5d77b2f2874f7a67a0b47e3ed641dc1d283f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-linkerscript-devel \
treesitter-grammar-src-tree-sitter-linkerscript"

RDEPENDS:${PN} += ""

inherit rpm
