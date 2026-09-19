SUMMARY = "Python binding for the swift tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_swift that loads the grammar library \
shipped in tree-sitter-swift and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python314-tree-sitter-swift-0.7.3-1.1.aarch64.rpm"
RPM_HASH = "33207538680bd7941946ae461662a3b34759b3b509570f8a9ba0a2d637198ffed2e7416bb3fa1e6303e209c174b74e223adc2bc0708d07ad802fcc308952ec0d"

RPROVIDES:${PN} += "python314-tree-sitter-swift"

RDEPENDS:${PN} += "python-abi \
tree-sitter-swift"

inherit rpm
