SUMMARY = "Devel package for tree-sitter-commonlisp containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "tree-sitter-commonlisp-devel-0.4.1-2.4.noarch.rpm"
RPM_HASH = "c1d8387827e8dc35dae082e41c3279618eb3ff4f42903ea284e4bd1c29514f674a83e2c8cae32ff67cc7747d372b104de1303b357a19e3b6244c5671bc1217ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-commonlisp-devel \
treesitter-grammar-src-tree-sitter-commonlisp"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-clojure"

inherit rpm
