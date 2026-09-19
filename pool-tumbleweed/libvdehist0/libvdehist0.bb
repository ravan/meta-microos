SUMMARY = "VDE history library"
DESCRIPTION = "This package contains VDE history library \
A library to manage history and command completion for vde mgmt protocol"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist0-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "4d31dd312cf6a6ee4ff24ea02f8a0132b32ba6ad0812af89b2e1f94eaf81fb6ddb381e8c93929d1f61bd22487387e9280d387855db22f9814ed67cff922ce4dd"

RPROVIDES:${PN} += "libvdehist.so.0 \
libvdehist0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
