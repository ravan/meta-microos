SUMMARY = "Starlark grammar for tree-sitter"
DESCRIPTION = "Starlark grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-starlark-1.3.0-2.4.aarch64.rpm"
RPM_HASH = "754d1717c7969d7eb6d962192e7d98c9f4bed54fd06679f52959cc63aa5a91397ff2b323741b6a8465caeaa1803b5ba1cf7d5581e134ad726c518459b45c5258"

RPROVIDES:${PN} += "libtree-sitter-starlark.so \
tree-sitter-starlark \
treesitter-grammar-tree-sitter-starlark"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
