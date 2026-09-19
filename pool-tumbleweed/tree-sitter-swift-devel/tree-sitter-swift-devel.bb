SUMMARY = "Devel package for tree-sitter-swift containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "tree-sitter-swift-devel-0.7.3-1.1.noarch.rpm"
RPM_HASH = "4b23160fd56a843f84d4bf884e2152b7ced0d78ff9de4965a0dfe93ca7c400ada508551bd9d85352192193c1795b79e304a714ce0054682a9a92478183756ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-swift-devel \
treesitter-grammar-src-tree-sitter-swift"

RDEPENDS:${PN} += ""

inherit rpm
