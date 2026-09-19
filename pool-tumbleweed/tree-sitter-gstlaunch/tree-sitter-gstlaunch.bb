SUMMARY = "GStreamer pipeline grammar for tree-sitter"
DESCRIPTION = "GStreamer pipeline grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "tree-sitter-gstlaunch-0.1.0-2.4.aarch64.rpm"
RPM_HASH = "87b4065ed451972e17b12eea50b10f9f99c885f08b9b09775b43b0f5c9b4a07002a99dd3b5d401885869f563f413f1bc419875a6ca583c7a8736309f009f4072"

RPROVIDES:${PN} += "libtree-sitter-gstlaunch.so \
tree-sitter-gstlaunch \
treesitter-grammar-tree-sitter-gstlaunch"

RDEPENDS:${PN} += ""

inherit rpm
