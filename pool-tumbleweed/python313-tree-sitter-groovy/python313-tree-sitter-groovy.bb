SUMMARY = "Python binding for the groovy tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_groovy that loads the grammar library \
shipped in tree-sitter-groovy and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-tree-sitter-groovy-0.1.2-1.1.aarch64.rpm"
RPM_HASH = "8b85ef54ee8a377429865d2415cd6bedd0592fb70f9489e0b39532f75eeb9b0e4bd4ff4bac0f09ac30019db8a3fe0def6245c0d45eb0f0298d6e5b212e888b7d"

RPROVIDES:${PN} += "python3-tree-sitter-groovy \
python313-tree-sitter-groovy"

RDEPENDS:${PN} += "python-abi \
tree-sitter-groovy"

inherit rpm
