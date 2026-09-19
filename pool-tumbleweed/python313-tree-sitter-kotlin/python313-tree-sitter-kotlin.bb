SUMMARY = "Python binding for the tree-sitter-kotlin grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-kotlin grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-tree-sitter-kotlin-1.1.0-3.1.aarch64.rpm"
RPM_HASH = "f38f3c2d113ad18b1f66f0bc2daa4aef1d2a7e3765e333752778608612e7855f189250df3b4d78a396d3e660da2a0c57881fcb67eb8856759d1a2a7ef57aabe1"

RPROVIDES:${PN} += "python3-tree-sitter-kotlin \
python313-tree-sitter-kotlin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
