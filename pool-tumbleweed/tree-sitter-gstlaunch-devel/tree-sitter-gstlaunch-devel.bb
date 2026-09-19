SUMMARY = "Devel package for tree-sitter-gstlaunch containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "tree-sitter-gstlaunch-devel-0.1.0-2.4.noarch.rpm"
RPM_HASH = "39e6b35eedf1cf78aa50c2cf7338fdcffa6cb05c80fb3aacb76fbe3de114ad7767655f9874ce1423bd4a4f57e453ed6fd693ea81a839bc3168d81021b0744c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-gstlaunch-devel \
treesitter-grammar-src-tree-sitter-gstlaunch"

RDEPENDS:${PN} += ""

inherit rpm
