SUMMARY = "Python binding for the powershell tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_powershell that loads the grammar library \
shipped in tree-sitter-powershell and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.26.4"

RPM_NAME = "python313-tree-sitter-powershell-0.26.4-1.1.aarch64.rpm"
RPM_HASH = "0890bc5d5c8129dbc4a4278ad2371a55fe99d912ad19b83f8127037e08b82f417a1d3da48e4dc5f6ea56c291bfead33cbc4a85c955e9b79186ec90965ee2db1c"

RPROVIDES:${PN} += "python3-tree-sitter-powershell \
python313-tree-sitter-powershell"

RDEPENDS:${PN} += "python-abi \
tree-sitter-powershell"

inherit rpm
