SUMMARY = "Python bindings to the Tree-sitter parsing library"
DESCRIPTION = "This module provides Python bindings to the tree-sitter parsing library."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "python314-tree-sitter-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "e998794276432b2d56c527778e91b5b0875fd24c9fec0e453cd5a028a81aa6e6779219d5d9d8afc079b6bda5089f6aeea3afc8c0f8d505681920de1a3fed9926"

RPROVIDES:${PN} += "python3.14dist-tree-sitter \
python314-tree-sitter \
python3dist-tree-sitter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
