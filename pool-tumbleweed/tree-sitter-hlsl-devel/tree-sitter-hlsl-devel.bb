SUMMARY = "Devel package for tree-sitter-hlsl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-hlsl-devel-0.2.0-2.4.noarch.rpm"
RPM_HASH = "486159c1b13a930cc1ebc5370091b8791734ea5021e1ec7b0664cb552f30b1fffe95c7183a57929abcc358902540faeea1573cc5bc8d951667b4444ac2eb0f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-hlsl-devel \
treesitter-grammar-src-tree-sitter-hlsl"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-cpp"

inherit rpm
