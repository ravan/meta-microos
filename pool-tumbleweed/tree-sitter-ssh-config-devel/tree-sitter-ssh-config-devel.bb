SUMMARY = "Devel package for tree-sitter-ssh-config containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "tree-sitter-ssh-config-devel-0.4.0-2.4.noarch.rpm"
RPM_HASH = "445d0604bc30047ccb2e8bd44bc5ec95242c76c7d287acd9f391d680d20f41e4261898681023c8c34b77fc0a535376deec23f81350525fc4ae0ae58ecea72630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-ssh-config-devel \
treesitter-grammar-src-tree-sitter-ssh-config"

RDEPENDS:${PN} += ""

inherit rpm
