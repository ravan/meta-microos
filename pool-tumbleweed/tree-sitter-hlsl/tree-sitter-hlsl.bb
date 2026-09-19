SUMMARY = "HLSL grammar for tree-sitter"
DESCRIPTION = "HLSL grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-hlsl-0.2.0-2.4.aarch64.rpm"
RPM_HASH = "695d0d5e2a28cd94aa3e99149f5a20f273c79aba09aa6c1ff628b3d22b4074006a205ed2aab09446fc2f79a3338ac511993c497dc2ef244104b98f6106c32f03"

RPROVIDES:${PN} += "libtree-sitter-hlsl.so \
tree-sitter-hlsl \
treesitter-grammar-tree-sitter-hlsl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
