SUMMARY = "Python bindings to the Tree-sitter parsing library"
DESCRIPTION = "This module provides Python bindings to the tree-sitter parsing library."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "python313-tree-sitter-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "0654e86f4eb4641eb2cc08de617a73f351bd602968aec623b810230da9afbeb0497bb00da4c147cc66125fd06fe64f663790b5ce86fc5c8f1eebe8b1e8392f3b"

RPROVIDES:${PN} += "python3-tree-sitter \
python3.13dist-tree-sitter \
python313-tree-sitter \
python3dist-tree-sitter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
