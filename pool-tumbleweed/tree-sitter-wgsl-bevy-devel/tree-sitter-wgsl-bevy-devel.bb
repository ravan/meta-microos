SUMMARY = "Devel package for tree-sitter-wgsl-bevy containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "tree-sitter-wgsl-bevy-devel-0.1.4-1.3.noarch.rpm"
RPM_HASH = "659f1ddbeb686fd63b6e5d57be4289e4b9a04c3390f6909a1b4b599420744dd8c9d4ce9ab0ec5a834b2a4f8a2660387f1f5689d6eee4de657f1f8947698bd46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-wgsl-bevy-devel \
treesitter-grammar-src-tree-sitter-wgsl-bevy"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-wgsl"

inherit rpm
