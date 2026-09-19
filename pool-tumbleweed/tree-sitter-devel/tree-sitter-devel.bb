SUMMARY = "Development files for tree-sitter"
DESCRIPTION = "The tree-sitter-devel package contains libraries and header files for \
developing applications that use tree-sitter."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.26.8"

RPM_NAME = "tree-sitter-devel-0.26.8-5.2.aarch64.rpm"
RPM_HASH = "3cd28bd54ccbd76c45466360d161e18ae9fdf7abf7b633ef1f915061338252cf81b873814f103e195fc2ce00963a3e16d0a07ad937625c49f20c76c2e5660ac5"

RPROVIDES:${PN} += "pkgconfig-tree-sitter \
tree-sitter-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtree-sitter0-26"

inherit rpm
