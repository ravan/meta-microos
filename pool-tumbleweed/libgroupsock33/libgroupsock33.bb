SUMMARY = "Group sock library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "libgroupsock33-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "871dc5d01a6cf23e375a3204aeb6e25ad96852fa85ba8dfe876a41ed07668362809d2847712f7dd3a48eed82df0288805eec4a77178979519d88dccdcc273ac4"

RPROVIDES:${PN} += "libgroupsock.so.33 \
libgroupsock33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
