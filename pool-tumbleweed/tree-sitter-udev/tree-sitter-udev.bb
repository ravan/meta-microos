SUMMARY = "Udev rules grammar for tree-sitter"
DESCRIPTION = "Udev rules grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "tree-sitter-udev-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "b8d058af3077d94dfbb5788be0f3b2e6a2aad2afe87883b47bc9e2e42c09e11d820f0c5d6d5c7ce9545354d91f369826fcae55dbdd0697866cef69871c88da4e"

RPROVIDES:${PN} += "libtree-sitter-udev.so \
tree-sitter-udev \
treesitter-grammar-tree-sitter-udev"

RDEPENDS:${PN} += ""

inherit rpm
