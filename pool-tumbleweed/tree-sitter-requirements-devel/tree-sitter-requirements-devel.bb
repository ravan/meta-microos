SUMMARY = "Devel package for tree-sitter-requirements containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-requirements-devel-0.5.0-2.4.noarch.rpm"
RPM_HASH = "c44cee9c14fb6240eda08ca13cbe55e41f3c01660ff5ac23b49b407b7ffb8ac1d2ddd2cee4b4c33337070284adb9309cc6e767c01d9e22af75ab45437b79b873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-requirements-devel \
treesitter-grammar-src-tree-sitter-requirements"

RDEPENDS:${PN} += ""

inherit rpm
