SUMMARY = "Devel package for tree-sitter-smali containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-smali-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "3b81b1630d4aaacc9ff029ca1fa12f6d6cb43a54177e601d9691826df451720b0055b5404d6b9b0d80568adce5ba353f8a032265b22944450cf31691181c3a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-smali-devel \
treesitter-grammar-src-tree-sitter-smali"

RDEPENDS:${PN} += ""

inherit rpm
