SUMMARY = "Python binding for the scala tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_scala that loads the grammar library \
shipped in tree-sitter-scala and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "python314-tree-sitter-scala-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "f2c14cdd9f2800589231c8fb8557fbb11a921a2538b62b3f6b600ab69228d7a106a29e4ec2b538d6500aad2ffcd44795d82454f8efbc6519b4fe7d752478519e"

RPROVIDES:${PN} += "python314-tree-sitter-scala"

RDEPENDS:${PN} += "python-abi \
tree-sitter-scala"

inherit rpm
