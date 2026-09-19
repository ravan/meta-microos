SUMMARY = "Devel package for tree-sitter-verilog containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "tree-sitter-verilog-devel-1.0.3-1.1.noarch.rpm"
RPM_HASH = "a8c35756f066187a75aa2fab2ebb41de9bc66bede10d1731ec66c4ef3efedbbd173b6aa72a146216c24bcfde215203817355876a086fe6a7203408d46d9e015d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-verilog-devel \
treesitter-grammar-src-tree-sitter-verilog"

RDEPENDS:${PN} += ""

inherit rpm
