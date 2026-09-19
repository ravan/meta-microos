SUMMARY = "Svelte grammar for tree-sitter"
DESCRIPTION = "Svelte grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "tree-sitter-svelte-1.0.2-2.4.aarch64.rpm"
RPM_HASH = "664fd5d32acfab1d789f70fd8e27c6fb9fd1694dbe7f80e99cabab4af25f19cf1e3cfa056948c0202f089def47e3b3c0289a38b64872a63d1678e7ef134c2aea"

RPROVIDES:${PN} += "libtree-sitter-svelte.so \
tree-sitter-svelte \
treesitter-grammar-tree-sitter-svelte"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
