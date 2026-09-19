SUMMARY = "Basic Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "libBasicUsageEnvironment2-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "2cfe7cdacc39c27c784ac3d0d59295b1ebd778b58e9a76a28206495ce426ce9f44983894f7e4822fee4ad2c04f7bcd1b6366dfbce827b591dc189a7bec713a59"

RPROVIDES:${PN} += "libBasicUsageEnvironment.so.2 \
libBasicUsageEnvironment2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
