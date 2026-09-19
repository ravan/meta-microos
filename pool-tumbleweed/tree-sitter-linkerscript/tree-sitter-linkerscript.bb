SUMMARY = "LD linker script grammar for tree-sitter"
DESCRIPTION = "LD linker script grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-linkerscript-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "c7d9549c1a2a9fdefd230c7906c48cb8cc2f6972007dbb212408115b91e7fb92417b3f947986e3163491cb82a2f05b44c23b8adc7d72dd46b7b36934cc292469"

RPROVIDES:${PN} += "libtree-sitter-linkerscript.so \
tree-sitter-linkerscript \
treesitter-grammar-tree-sitter-linkerscript"

RDEPENDS:${PN} += ""

inherit rpm
