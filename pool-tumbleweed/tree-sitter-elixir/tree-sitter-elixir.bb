SUMMARY = "Elixir grammar for tree-sitter"
DESCRIPTION = "Python binding for the elixir tree-sitter grammar."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "tree-sitter-elixir-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "e103fc4cbd32a9cd5f59caf8aac38c6b6b36355d1bdf3d1537e2a2246897c473658f7213aaf0678a0de4e6ed894b7828aa3fd34ec38b507682071935d60574a0"

RPROVIDES:${PN} += "libtree-sitter-elixir.so \
tree-sitter-elixir \
treesitter-grammar-tree-sitter-elixir"

RDEPENDS:${PN} += ""

inherit rpm
