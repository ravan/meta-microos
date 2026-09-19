SUMMARY = "Devel package for tree-sitter-org containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "tree-sitter-org-devel-2.0.2-2.4.noarch.rpm"
RPM_HASH = "7820c49153f87b510897d86887b8a62754f9c51665db666b5f81dee464fda00aa8a2c389010571df8e49a14ff79edd16670579ae56eb65ec4868916e09d8958b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-org-devel \
treesitter-grammar-src-tree-sitter-org"

RDEPENDS:${PN} += ""

inherit rpm
