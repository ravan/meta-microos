SUMMARY = "Devel package for tree-sitter-hare containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-hare-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "daebfdd3c7a007820b9a5ad4f38e4b401996ba6cc8ff454a1e97365b7a52b232f3d956affc6884b89c8dbd3b839f0bc51a32e13bc8e52500e5bb5adf2b26c540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-hare-devel \
treesitter-grammar-src-tree-sitter-hare"

RDEPENDS:${PN} += ""

inherit rpm
