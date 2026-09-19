SUMMARY = "Python binding for the elixir tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_elixir that loads the grammar library \
shipped in tree-sitter-elixir and exposes it to python-tree-sitter via language()."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "python313-tree-sitter-elixir-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "16c99e0a3b210882da4accf3dde33dff99a29d3258293f8fbdd855f56a0127a35aac44dfd0c10ee828fd6e06143d615d7c341876b2801e2f746cc1170d0830fa"

RPROVIDES:${PN} += "python3-tree-sitter-elixir \
python313-tree-sitter-elixir"

RDEPENDS:${PN} += "python-abi \
tree-sitter-elixir"

inherit rpm
