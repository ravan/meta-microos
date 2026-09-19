SUMMARY = "Devel package for tree-sitter-qmldir containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.2.12.6b2b5e4"

RPM_NAME = "tree-sitter-qmldir-devel-0.2.2.12.6b2b5e4-3.5.noarch.rpm"
RPM_HASH = "aeefc63aa9af96af8115f4232809ca742539a8101a33d9cad84089be596ebe48e965bf079388cfd7fe1e1aa467b56837a812a9494c005cf0b45ffcb6a2cc5d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-qmldir-devel \
treesitter-grammar-src-tree-sitter-qmldir"

RDEPENDS:${PN} += ""

inherit rpm
