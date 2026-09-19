SUMMARY = "Markdown grammar for tree-sitter"
DESCRIPTION = "Markdown grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "tree-sitter-markdown-0.5.3-2.3.aarch64.rpm"
RPM_HASH = "1360e69066423071a3544e85a8cc62fb601cba6fc6ce18aa13bf371818c81f02b623a1bf25c7cb6c1ea377b3514596cc36897586c0a932aeff852a7d309f038d"

RPROVIDES:${PN} += "libtree-sitter-markdown-inline.so \
libtree-sitter-markdown.so \
tree-sitter-markdown \
treesitter-grammar-tree-sitter-markdown \
treesitter-grammar-tree-sitter-markdown-inline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
