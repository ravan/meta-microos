SUMMARY = "Thrift grammar for tree-sitter"
DESCRIPTION = "Thrift grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-thrift-0.5.0-2.4.aarch64.rpm"
RPM_HASH = "deec2bb4c475afd527f58ea8f1f35c5c41aeb56947526fb64167a7c614ee29f7aecc86c2e73781e51917b0f5cef58d0541eb3116afcec7b2a4272788a71c2aa3"

RPROVIDES:${PN} += "libtree-sitter-thrift.so \
tree-sitter-thrift \
treesitter-grammar-tree-sitter-thrift"

RDEPENDS:${PN} += ""

inherit rpm
