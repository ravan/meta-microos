SUMMARY = "Python grammar for tree-sitter"
DESCRIPTION = "Python binding for the python tree-sitter grammar."
LICENSE = "MIT"

PV = "0.23.6"

RPM_NAME = "tree-sitter-python-0.23.6-3.1.aarch64.rpm"
RPM_HASH = "fb205e0d0f6a4a15dad745a555416637b6b6ec98d6dbd67a1103799adc4601acdf9ba19d0dee0a3dc759dcebe6105e10c852973e1e897b8187f93ba76f728b0c"

RPROVIDES:${PN} += "libtree-sitter-python.so \
tree-sitter-python \
treesitter-grammar-tree-sitter-python"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
