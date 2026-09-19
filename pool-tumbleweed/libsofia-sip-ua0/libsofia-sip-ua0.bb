SUMMARY = "A RFC3261 compliant SIP User-Agent library"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.18"

RPM_NAME = "libsofia-sip-ua0-1.13.18-1.1.aarch64.rpm"
RPM_HASH = "4f3d386d45158715b9d7c569d56f00a14099d011fd9fc302904d259cfd865668cef9172997daa6f6b55085b5eba8ee238729d46ddb3fd76d9024edd17544415c"

RPROVIDES:${PN} += "libsofia-sip-ua.so.0 \
libsofia-sip-ua0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
