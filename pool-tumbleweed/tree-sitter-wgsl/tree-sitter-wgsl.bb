SUMMARY = "WebGPU Shading Language grammar for tree-sitter parser"
DESCRIPTION = "WebGPU Shading Language grammar for tree-sitter parser."
LICENSE = "MIT"

PV = "0+20230109.40259f3"

RPM_NAME = "tree-sitter-wgsl-0+20230109.40259f3-2.4.aarch64.rpm"
RPM_HASH = "8a660e2659fcae37586f59368eb981aaa2318ea754e8c659b04a0aee2857524ae549b4f118c40b008376698e0289284a3105e610ca5e88658958dd9de0382491"

RPROVIDES:${PN} += "libtree-sitter-wgsl.so \
tree-sitter-wgsl \
treesitter-grammar-tree-sitter-wgsl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
