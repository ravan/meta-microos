SUMMARY = "Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "libUsageEnvironment3-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "3c46d18ac4f513c6ea6576e68bcccea3080ba9b939c35894a063e04b728c492e37aff526a710d37980ea30d89d7c9f0799371625c46bf130cab7d1b4e26d53a4"

RPROVIDES:${PN} += "libUsageEnvironment.so.3 \
libUsageEnvironment3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
