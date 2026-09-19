SUMMARY = "Gitattributes grammar for tree-sitter"
DESCRIPTION = "Gitattributes grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "tree-sitter-gitattributes-0.1.6-2.4.aarch64.rpm"
RPM_HASH = "e673489ec93e390438da182982544416bd202e22543ac3547bf53f31adbfa7c1df1a416b0699871f2037799b17265fcc97c08b2be713b334246fba446f4e7420"

RPROVIDES:${PN} += "libtree-sitter-gitattributes.so \
tree-sitter-gitattributes \
treesitter-grammar-tree-sitter-gitattributes"

RDEPENDS:${PN} += ""

inherit rpm
