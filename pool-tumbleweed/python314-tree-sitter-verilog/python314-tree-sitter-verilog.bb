SUMMARY = "Python binding for the verilog tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_verilog that loads the grammar library \
shipped in tree-sitter-verilog and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python314-tree-sitter-verilog-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "616400a5a9769b6904725cfecae1f599630443278db7e5f770c0094640d7b47cc09b61b101c33d77b6787c5977bbc78e92c04a4c756b3e121ab044679e63250d"

RPROVIDES:${PN} += "python314-tree-sitter-verilog"

RDEPENDS:${PN} += "python-abi \
tree-sitter-verilog"

inherit rpm
