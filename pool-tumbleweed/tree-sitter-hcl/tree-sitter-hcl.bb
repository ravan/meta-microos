SUMMARY = "HCL and Terraform grammars for tree-sitter"
DESCRIPTION = "HCL and Terraform grammars for tree-sitter."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "tree-sitter-hcl-1.2.0-3.3.aarch64.rpm"
RPM_HASH = "aedf114b591b6132dc66940c4f52e3eaca30c0ceaff33a204f28647a14724dda16a82d3bd48d5f37920df3da80330a2336c15ca38da318926749fe1e6b6912a5"

RPROVIDES:${PN} += "libtree-sitter-hcl.so \
libtree-sitter-terraform.so \
tree-sitter-hcl \
treesitter-grammar-tree-sitter-hcl \
treesitter-grammar-tree-sitter-terraform"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
