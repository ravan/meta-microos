SUMMARY = "Devel package for tree-sitter-odin containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-odin-devel-1.3.0-2.4.noarch.rpm"
RPM_HASH = "40357e4f30f09769a16db6d7aa27feea4af9890a0c34b3020f9a0f54980c3b3157078fab04807ac4a26654cd1a9863fede0d7ff116f76e5e7d73e5a0b2493f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-odin-devel \
treesitter-grammar-src-tree-sitter-odin"

RDEPENDS:${PN} += ""

inherit rpm
