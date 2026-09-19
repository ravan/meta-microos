SUMMARY = "A RFC3261 compliant SIP User-Agent library  (glib2 bindings)"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the glib2 bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.18"

RPM_NAME = "libsofia-sip-ua-glib3-1.13.18-1.1.aarch64.rpm"
RPM_HASH = "8d3d32f514a8cc33e751f7c2064ba2b065b0721fb332ca911f9193e46738495875dd2e003d4f140647f11585fef62ebc2494832bd38e168807044e64f6c681b4"

RPROVIDES:${PN} += "libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua-glib3 \
sofia-sip-glib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
