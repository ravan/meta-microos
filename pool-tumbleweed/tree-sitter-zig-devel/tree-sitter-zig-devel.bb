SUMMARY = "Devel package for tree-sitter-zig containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "tree-sitter-zig-devel-1.1.2-3.1.noarch.rpm"
RPM_HASH = "898f2a07f0d01aa4d0b04e22c2d5840af07b6ec251f597b3c4ccd6f5eb1e2bb35068a0c4c8c456e4887650f4095e3dff003c6a6f18967a19122ceb4ea24498d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-zig-devel \
treesitter-grammar-src-tree-sitter-zig"

RDEPENDS:${PN} += ""

inherit rpm
