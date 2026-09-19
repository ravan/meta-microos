SUMMARY = "Python binding for the tree-sitter-lua grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-lua grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-tree-sitter-lua-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "a4958dec9db82cc822396de23ab7a0ffdeeeb6df7cd123835c8bcfe6717d377689376f00b2493c9552cddb54fa392c26bb9bd5f89cdbb271657b1559ce3c6e03"

RPROVIDES:${PN} += "python314-tree-sitter-lua"

RDEPENDS:${PN} += "python-abi"

inherit rpm
