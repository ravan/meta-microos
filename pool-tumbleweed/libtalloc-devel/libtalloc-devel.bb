SUMMARY = "Libraries and Header Files to Develop Programs with talloc2 Support"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
Libraries and Header Files to Develop Programs with talloc2 Support."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "libtalloc-devel-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "8f4b90a391b4600f3ae307c05236e5be589f6067ca958039493677b2abd139993e9794979ec2386e4cf7c8955c770219dd482c62403ade334ca251c2fc2f55e4"

RPROVIDES:${PN} += "libtalloc-devel \
pkgconfig-talloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc2 \
pkg-config"

inherit rpm
