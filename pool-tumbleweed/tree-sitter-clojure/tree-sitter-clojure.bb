SUMMARY = "Clojure(Script) grammar for tree-sitter"
DESCRIPTION = "Clojure(Script) grammar for tree-sitter."
LICENSE = "CC0-1.0"

PV = "0.0.12"

RPM_NAME = "tree-sitter-clojure-0.0.12-2.4.aarch64.rpm"
RPM_HASH = "80167900c418358acc0338a3ffd5f817bfa02f6d932760114800c010124ba606d442c50d2497b01e46ebb4822e09ef6f99a869f81f79a0ad97f5dfe8b6f0e5c4"

RPROVIDES:${PN} += "libtree-sitter-clojure.so \
tree-sitter-clojure \
treesitter-grammar-tree-sitter-clojure"

RDEPENDS:${PN} += ""

inherit rpm
