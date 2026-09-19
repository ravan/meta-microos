SUMMARY = "Puppet grammar for tree-sitter"
DESCRIPTION = "Puppet grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-puppet-1.3.0-2.4.aarch64.rpm"
RPM_HASH = "e792ba564476ef1f45685f9e7354229973c3b78e80fedf458dd88578ff173650dfe403c8c94f05889a3bc0c5179ce61406d2eb643dc5374ec160401895b55cc0"

RPROVIDES:${PN} += "libtree-sitter-puppet.so \
tree-sitter-puppet \
treesitter-grammar-tree-sitter-puppet"

RDEPENDS:${PN} += ""

inherit rpm
