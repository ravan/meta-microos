SUMMARY = "Devel package for tree-sitter-re2c containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20240925.c18a3c2"

RPM_NAME = "tree-sitter-re2c-devel-0+20240925.c18a3c2-2.4.noarch.rpm"
RPM_HASH = "e90fc9066ddc0eaf6fb966f256a2a828a4fb6687e30d4eb5942f9f0f5a929a72f0268d31d9aabe54aecc41a8830a11db2fc90d1e6730d3381dd23b315030687f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-re2c-devel \
treesitter-grammar-src-tree-sitter-re2c"

RDEPENDS:${PN} += ""

inherit rpm
