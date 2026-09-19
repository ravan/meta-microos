SUMMARY = "Lua grammar for tree-sitter"
DESCRIPTION = "Lua grammar for tree-sitter."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "tree-sitter-org-2.0.2-2.4.aarch64.rpm"
RPM_HASH = "aebd80dd979072140a6309b082344f8eef2e7401c3c2693eb9fa119b52dd1c4c3cecd20e94715c7cfc713da0525a354aef0511e12f56d6caef8fb65461fde779"

RPROVIDES:${PN} += "libtree-sitter-org.so \
tree-sitter-org \
treesitter-grammar-tree-sitter-org"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
