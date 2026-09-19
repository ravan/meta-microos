SUMMARY = "Devel package for tree-sitter-gitattributes containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "tree-sitter-gitattributes-devel-0.1.6-2.4.noarch.rpm"
RPM_HASH = "7d1dbdd1bc26df895aa162bf268e20596043bf89f09d668131e34a22aa8a77ec3fc4d66ef038f9863d173c9a7c8dfd6be4a4e05e9be9ceca74b4926dd983b982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-gitattributes-devel \
treesitter-grammar-src-tree-sitter-gitattributes"

RDEPENDS:${PN} += ""

inherit rpm
