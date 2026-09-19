SUMMARY = "Devel package for tree-sitter-rpmspec containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20260218.12ca618"

RPM_NAME = "tree-sitter-rpmspec-devel-0+20260218.12ca618-3.3.noarch.rpm"
RPM_HASH = "751b2c46caacb52aa2edcf70a0d214c1fcbba4d15d36bd403949f32c9b974b5e0f68a9b2201cbd597344758ced939adc0d54d699e88a95ee1525d27fc0411ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-rpmspec-devel \
treesitter-grammar-src-tree-sitter-rpmspec"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-bash"

inherit rpm
