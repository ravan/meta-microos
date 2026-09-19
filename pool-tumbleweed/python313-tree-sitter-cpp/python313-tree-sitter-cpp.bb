SUMMARY = "Python binding for the tree-sitter-cpp grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-cpp grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "python313-tree-sitter-cpp-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "88654b72b7e161c3ec2c94b80c92bc1f7388bb945219dcb85f98f5b101a11d65e6c6318b92e828672eb40398460a9348aff84feea09d6be7ca5142dcf2d5c467"

RPROVIDES:${PN} += "python3-tree-sitter-cpp \
python313-tree-sitter-cpp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
