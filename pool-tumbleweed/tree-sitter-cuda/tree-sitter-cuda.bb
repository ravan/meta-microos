SUMMARY = "CUDA grammar for tree-sitter"
DESCRIPTION = "CUDA grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "tree-sitter-cuda-0.21.0-2.4.aarch64.rpm"
RPM_HASH = "45bd18b3198d50c95e688d66b343deab09894a1f66eca8fbdf1f213e53c03f35c0ae13df497088251e47fa8512afd1a3fdfc8e971e7882b7b57f5d61176ae0b6"

RPROVIDES:${PN} += "libtree-sitter-cuda.so \
tree-sitter-cuda \
treesitter-grammar-tree-sitter-cuda"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
