SUMMARY = "Arduino grammar for tree-sitter"
DESCRIPTION = "Arduino grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "tree-sitter-arduino-0.24.0-2.4.aarch64.rpm"
RPM_HASH = "b9fc8cf89ae406e48a5c38e77ec905a8f5946d3802736c8a90fcbcf26b6b7e849665ab6ed5d9459af46ac33917db9b59695aa54a965b54c5ef1e5ee4ab162e75"

RPROVIDES:${PN} += "libtree-sitter-arduino.so \
tree-sitter-arduino \
treesitter-grammar-tree-sitter-arduino"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
