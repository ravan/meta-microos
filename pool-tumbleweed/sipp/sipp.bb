SUMMARY = "A SIP protocol testing tool"
DESCRIPTION = "Sipp is a performance testing tool for the SIP protocol. Its main features are \
basic SIPStone scenarios, TCP/UDP transport, customizable (xml based) scenarios, \
dynamic adjustement of call-rate and a comprehensive set of real-time \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.7"

RPM_NAME = "sipp-3.7.7-1.5.aarch64.rpm"
RPM_HASH = "d926a8f936af1259a46792a900d171f9d6b2dfab025338d8172fdfe95305aa670bb118a6f6babd9b2ec3656e49cf58a226aa9976f241a270822e2310fe4ccaaf"

RPROVIDES:${PN} += "sipp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libncursesw.so.6 \
libpcap.so.1 \
libsctp.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
