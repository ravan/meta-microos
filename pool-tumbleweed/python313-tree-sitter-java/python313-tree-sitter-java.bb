SUMMARY = "Python binding for the tree-sitter-java grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-java grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "python313-tree-sitter-java-0.23.5-3.1.aarch64.rpm"
RPM_HASH = "bbaf1a631e9f19465cdb9f492beecc323494f9ea33c6d9aeb782b5e290f3684b606cab2cdb97b902de489ea9add61adc44055e0580cc1dbdf41d4b2f0cd26392"

RPROVIDES:${PN} += "python3-tree-sitter-java \
python313-tree-sitter-java"

RDEPENDS:${PN} += "python-abi"

inherit rpm
