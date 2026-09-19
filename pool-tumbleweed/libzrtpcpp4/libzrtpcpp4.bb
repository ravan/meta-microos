SUMMARY = "A ccrtp extension for ZRTP support"
DESCRIPTION = "A library that adds RFC6189-compliant ZRTP support to the GNU ccRTP \
stack and serves as library for other RTP stacks such as PJSIP and \
GStreamer. ZRTP was developed to allow ad-hoc key negotiation to \
setup Secure RTP (SRTP) sessions."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp4-4.7.0-3.4.aarch64.rpm"
RPM_HASH = "c35c997e2bbbfaa23b19a72eea1cb7ad2ba55f9bfdd7af1049649da805a98018d0908c889c6584a0bff84eeccab6f335f4c965e1b9929d1e8f26cdbae3f9f9a6"

RPROVIDES:${PN} += "libzrtpcpp.so.4 \
libzrtpcpp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libccrtp.so.3 \
libcommoncpp.so.8 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libucommon.so.8"

inherit rpm
