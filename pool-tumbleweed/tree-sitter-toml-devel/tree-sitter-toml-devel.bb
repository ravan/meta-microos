SUMMARY = "Devel package for tree-sitter-toml containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "tree-sitter-toml-devel-0.7.0-2.4.noarch.rpm"
RPM_HASH = "affa33535b5d6caac9d56baa732a9d4be44386c8613f34858ce02ba9a6dbbe480dfe9bcb105db4fdf38b744fd4fa6274d043200569fe73eb87426f0b65239b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-toml-devel \
treesitter-grammar-src-tree-sitter-toml"

RDEPENDS:${PN} += ""

inherit rpm
