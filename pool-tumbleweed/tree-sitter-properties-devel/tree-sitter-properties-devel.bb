SUMMARY = "Devel package for tree-sitter-properties containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-properties-devel-0.3.0-2.4.noarch.rpm"
RPM_HASH = "185811f182f7ab89b8dc97674d997186362772d3cf6aae0d372b700834780d1eb12b032b415d1ab4b972e7c37ec86a5a40c336c513a4562ece3f656c09f7e470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-properties-devel \
treesitter-grammar-src-tree-sitter-properties"

RDEPENDS:${PN} += ""

inherit rpm
