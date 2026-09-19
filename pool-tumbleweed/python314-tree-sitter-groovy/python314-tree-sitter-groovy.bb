SUMMARY = "Python binding for the groovy tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_groovy that loads the grammar library \
shipped in tree-sitter-groovy and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-tree-sitter-groovy-0.1.2-1.1.aarch64.rpm"
RPM_HASH = "455c95335259646a2cd1ec116ed882acd560822a6bfc27703905864324ccdd5af95848457a0e07f1511f72af37b9aba5937b5f4b15d8f58bc3b59e248bf2c10b"

RPROVIDES:${PN} += "python314-tree-sitter-groovy"

RDEPENDS:${PN} += "python-abi \
tree-sitter-groovy"

inherit rpm
