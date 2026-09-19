SUMMARY = "Vimscript grammar for tree-sitter"
DESCRIPTION = "Vimscript grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "tree-sitter-vim-0.8.1-1.3.aarch64.rpm"
RPM_HASH = "a27a6cc0ab5dacb2db824d21861849eaf9564be4dae5afe63ec9204eac7ccf6c208de3db0df006d23d74ff7867599ead2223959e41d33d3876e208a8bf78e8c0"

RPROVIDES:${PN} += "libtree-sitter-vim.so \
tree-sitter-vim \
treesitter-grammar-tree-sitter-vim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
