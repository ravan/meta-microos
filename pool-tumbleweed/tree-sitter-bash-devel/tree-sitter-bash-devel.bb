SUMMARY = "Devel package for tree-sitter-bash containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "tree-sitter-bash-devel-0.25.1-3.1.noarch.rpm"
RPM_HASH = "919f043497a65246630772904e3241382f92f91e3d0a1360cac4226a261f5efbd1abd1882ea692d8c475c169b77e10aa20aab61746c907a151e30bfaff530a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-bash-devel \
treesitter-grammar-src-tree-sitter-bash"

RDEPENDS:${PN} += ""

inherit rpm
