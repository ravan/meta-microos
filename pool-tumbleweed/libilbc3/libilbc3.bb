SUMMARY = "Internet Low Bitrate Codec"
DESCRIPTION = "iLBC (internet Low Bitrate Codec) is a FREE speech codec suitable for \
robust voice communication over IP. The codec is designed for narrow \
band speech and results in a payload bit rate of 13.33 kbit/s with an \
encoding frame length of 30 ms and 15.20 kbps with an encoding length \
of 20 ms. The iLBC codec enables graceful speech quality degradation in \
the case of lost frames, which occurs in connection with lost or \
delayed IP packets."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "libilbc3-3.0.4-1.5.aarch64.rpm"
RPM_HASH = "d296e0a5bde45fbeaa3c8bd227d06a558cabfbce3c9c7746eeff4bd48c45e0964f97d55b1c08e6611a4d0ce5ef6c3e8660824e2d8f86f4d0448049f1a79dca4e"

RPROVIDES:${PN} += "ilbc \
libilbc.so.3 \
libilbc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
