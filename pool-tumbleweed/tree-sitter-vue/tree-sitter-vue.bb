SUMMARY = "Vue.js grammar for tree-sitter"
DESCRIPTION = "Vue.js grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20260124.ce8011a"

RPM_NAME = "tree-sitter-vue-0+20260124.ce8011a-1.3.aarch64.rpm"
RPM_HASH = "8af2aa46b67fdea485b86b90da3643e9c566f65e025784dfc073e1d785907f16dab7f5ac67df869310e5d8876a38e379077c398842a676eecb23e3af50cf0098"

RPROVIDES:${PN} += "libtree-sitter-vue.so \
tree-sitter-vue \
treesitter-grammar-tree-sitter-vue"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
