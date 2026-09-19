SUMMARY = "PEM grammar for tree-sitter"
DESCRIPTION = "PEM grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "tree-sitter-pem-0.1.1-2.4.aarch64.rpm"
RPM_HASH = "77795c89fe61da3039542c835947baee99372f080c34c5e3f37ce4e0bee1f9a5bbb806ad22a676972b429fdb845bb0a851e84c783bbe97ea6743a9c04ab65156"

RPROVIDES:${PN} += "libtree-sitter-pem.so \
tree-sitter-pem \
treesitter-grammar-tree-sitter-pem"

RDEPENDS:${PN} += ""

inherit rpm
