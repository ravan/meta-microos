SUMMARY = "HTML grammar for tree-sitter"
DESCRIPTION = "HTML grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-html-0.23.2-2.5.aarch64.rpm"
RPM_HASH = "869e77210ad0cb45eb753c25a20e815656bc158c5960fd8f255ad83321007d140e4598365b60375615c0d53c1d278f694eb68d04ee7c7174f43139bb31a7c1ee"

RPROVIDES:${PN} += "libtree-sitter-html.so \
tree-sitter-html \
treesitter-grammar-tree-sitter-html"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
