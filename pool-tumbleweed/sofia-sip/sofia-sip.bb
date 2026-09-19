SUMMARY = "A RFC3261 compliant SIP User-Agent library"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the cli tools what ship with sofia-sip."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.18"

RPM_NAME = "sofia-sip-1.13.18-1.1.aarch64.rpm"
RPM_HASH = "c23bc8d0864d4aa01e191be13b22cb302e4ad597b59f787b6c13074d1b00694009e0a9de4cf6743c4e484b17c95d6d9baeeeb353c6d0d77a3baf44f1479c6838"

RPROVIDES:${PN} += "sofia-sip \
sofia-sip-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsofia-sip-ua.so.0 \
libssl.so.3"

inherit rpm
