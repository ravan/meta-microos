SUMMARY = "TOML grammar for tree-sitter"
DESCRIPTION = "TOML grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "tree-sitter-toml-0.7.0-2.4.aarch64.rpm"
RPM_HASH = "358efe1c7676493a755176ac7e7981dc192789faafe72d588b62af097877cee6b20fcbdd2919b46f9a5156ad45e16bf030bb72d744b4be75720a50d5ea262dc8"

RPROVIDES:${PN} += "libtree-sitter-toml.so \
tree-sitter-toml \
treesitter-grammar-tree-sitter-toml"

RDEPENDS:${PN} += ""

inherit rpm
