SUMMARY = "Python binding for the verilog tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_verilog that loads the grammar library \
shipped in tree-sitter-verilog and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python313-tree-sitter-verilog-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "1b00e627765255aaff2a781cda672893033493267863fdbfce90bee520e4c31ca4b4b0ffc3a4c8e5da4862e97f6b8bde80a4c96c68026b2dbf87d65b5b8ee4d9"

RPROVIDES:${PN} += "python3-tree-sitter-verilog \
python313-tree-sitter-verilog"

RDEPENDS:${PN} += "python-abi \
tree-sitter-verilog"

inherit rpm
