SUMMARY = "Groovy grammar for tree-sitter"
DESCRIPTION = "Python binding for the groovy tree-sitter grammar."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "tree-sitter-groovy-0.1.2-1.1.aarch64.rpm"
RPM_HASH = "1c0893422b5af96f975b82e2db0640ea50ba2745bb358d5d6d300b62f3f5b7959169bf0a1798e73f31a0139aae52fb84bd5767752db1478cca9389c857334ef4"

RPROVIDES:${PN} += "libtree-sitter-groovy.so \
tree-sitter-groovy \
treesitter-grammar-tree-sitter-groovy"

RDEPENDS:${PN} += ""

inherit rpm
