SUMMARY = "Performance Co-Pilot run-time MMV library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time Memory Mapped Values library"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp_mmv1-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "c4e05f9ff4710c158b140663721847182920e79c5d90d1ee14953ecaf40fe07f25377e78eac97d58ffd9a4786ee89af81d71139a9271445f37d296b3c59c0df3"

RPROVIDES:${PN} += "libpcp-mmv.so.1 \
libpcp-mmv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
