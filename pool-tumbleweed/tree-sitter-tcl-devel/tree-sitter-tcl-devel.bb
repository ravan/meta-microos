SUMMARY = "Devel package for tree-sitter-tcl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20250514.8f11ac7"

RPM_NAME = "tree-sitter-tcl-devel-0+20250514.8f11ac7-1.3.noarch.rpm"
RPM_HASH = "1548b90f6c5cd7197ac46ce37929a64613d405413f6909336ca4fef39a40f1f9f703c190e19a863467ed0e7267abb6c5c046c0fe42db2c04df50f57c9a80f9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-tcl-devel \
treesitter-grammar-src-tree-sitter-tcl"

RDEPENDS:${PN} += ""

inherit rpm
