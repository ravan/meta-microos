SUMMARY = "Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "yate-6.4.0-6.6.aarch64.rpm"
RPM_HASH = "b674db95635d811044e405469458e757f11f0a252a3a84264915804f0b0c3a0de2b73dd8b868fe023dc7a68ae8f521081c94c1a39a66e691ebd7df50728151c2"

RPROVIDES:${PN} += "config-yate \
yate"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcrypto.so.3 \
libgsm.so.1 \
libm.so.6 \
libsctp.so.1 \
libspandsp.so.3 \
libspeex.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libyate.so.6.4.0 \
libyateasn.so.6.4.0 \
libyatejabber.so.6.4.0 \
libyatemgcp.so.6.4.0 \
libyateradio.so.6.4.0 \
libyatescript.so.6.4.0 \
libyatesig.so.6.4.0 \
libz.so.1"

inherit rpm
