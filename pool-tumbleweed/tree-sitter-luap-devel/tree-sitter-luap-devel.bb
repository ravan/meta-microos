SUMMARY = "Devel package for tree-sitter-luap containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "tree-sitter-luap-devel-1.0.1-2.4.noarch.rpm"
RPM_HASH = "a7e5d90e76209bfa13f03e45927b7b7d5ccc7736298340aa3489d82e85df849d48246b16c700409013d5f56f74f4f23dca36997c92a9ce8776ead7034f1bf51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-luap-devel \
treesitter-grammar-src-tree-sitter-luap"

RDEPENDS:${PN} += ""

inherit rpm
