SUMMARY = "Devel package for tree-sitter-gomod containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-gomod-devel-1.1.0-3.5.noarch.rpm"
RPM_HASH = "d01450dece504a0a6a30c523f09ed612ac09309a853880b167b5f952b721adb12e6f9b5ccc86f8f2c37d5d8b8212624d16816b85d43247e310cf414a3f420821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-gomod-devel \
treesitter-grammar-src-tree-sitter-gomod"

RDEPENDS:${PN} += ""

inherit rpm
