SUMMARY = "GLSL grammar for tree-sitter"
DESCRIPTION = "GLSL grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-glsl-0.2.0-2.4.aarch64.rpm"
RPM_HASH = "f79ee467dd5ae9f01ae7d42e718b600aaa51cc039666439b38c402cf3dda5bb4e03743b4397f97b3e01f340512f616c8d27a3d3eb184483bd9d1c17c29222f9e"

RPROVIDES:${PN} += "libtree-sitter-glsl.so \
tree-sitter-glsl \
treesitter-grammar-tree-sitter-glsl"

RDEPENDS:${PN} += ""

inherit rpm
