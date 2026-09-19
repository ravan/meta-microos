SUMMARY = "Python binding for the tree-sitter-typescript grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-typescript grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "python314-tree-sitter-typescript-0.23.2-3.1.aarch64.rpm"
RPM_HASH = "eea5af0ea588dda49ec9c33693b0a46cada1eb5b2b8c4f52d5e8fff92e7b14235450f6a210d5407f536db16159a18f1bcc302dc48056ecf54613d50b4a51dadd"

RPROVIDES:${PN} += "python314-tree-sitter-typescript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
