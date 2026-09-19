SUMMARY = "Python binding for the powershell tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_powershell that loads the grammar library \
shipped in tree-sitter-powershell and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.26.4"

RPM_NAME = "python314-tree-sitter-powershell-0.26.4-1.1.aarch64.rpm"
RPM_HASH = "782042bc22b01c9bbeadf45f89f26ab25664eb895db418319a016925824bceeb747878d75abfb1f587c10b14289156340c264035404b0dd97ffbf1b3b045e55e"

RPROVIDES:${PN} += "python314-tree-sitter-powershell"

RDEPENDS:${PN} += "python-abi \
tree-sitter-powershell"

inherit rpm
