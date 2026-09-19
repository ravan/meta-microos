SUMMARY = "Performance Co-Pilot run-time import library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time import library"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp_import1-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "09ecea92138a71a1eb7e263bc675a1e032a012c671fc71ee83fe18852dc8b1ae54d190d90285fa8377d2d3cfd0ebbdb44870193499a3ad36ed7c05243ccd2d13"

RPROVIDES:${PN} += "libpcp-import.so.1 \
libpcp-import1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
