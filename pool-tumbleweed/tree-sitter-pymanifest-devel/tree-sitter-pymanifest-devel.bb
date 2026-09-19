SUMMARY = "Devel package for tree-sitter-pymanifest containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "tree-sitter-pymanifest-devel-0.5.1-2.4.noarch.rpm"
RPM_HASH = "7cea83c88a3c12f7d07fd9c461d4967c47e78e4d40d8cb0a52130184134032dbb56fb55726bd0c5b1126a2f68b130e81ff03f9bc617687cb6e7d2f087b81fe65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-pymanifest-devel \
treesitter-grammar-src-tree-sitter-pymanifest"

RDEPENDS:${PN} += ""

inherit rpm
