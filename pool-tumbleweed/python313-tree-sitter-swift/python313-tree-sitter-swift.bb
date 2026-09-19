SUMMARY = "Python binding for the swift tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_swift that loads the grammar library \
shipped in tree-sitter-swift and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python313-tree-sitter-swift-0.7.3-1.1.aarch64.rpm"
RPM_HASH = "dc6c692025ce7e491ba6daf54505fa52cbfd0e9f4df36945c009af3425fa163b64b9da41a61e85fed46926467b85cca522d755f33f1b513be0e1e1de62e3e311"

RPROVIDES:${PN} += "python3-tree-sitter-swift \
python313-tree-sitter-swift"

RDEPENDS:${PN} += "python-abi \
tree-sitter-swift"

inherit rpm
