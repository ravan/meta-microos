SUMMARY = "Python binding for the tree-sitter-java grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-java grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "python314-tree-sitter-java-0.23.5-3.1.aarch64.rpm"
RPM_HASH = "88b071f1fe382ab09cef847ff6291ec2cfac420fb5ddb22f3686966ae5843f4464ac7364f3e98e813415b1f4a0d0a209fddab980adb2b0b344c12a41039ddf5c"

RPROVIDES:${PN} += "python314-tree-sitter-java"

RDEPENDS:${PN} += "python-abi"

inherit rpm
