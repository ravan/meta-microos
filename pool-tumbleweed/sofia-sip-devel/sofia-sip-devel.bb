SUMMARY = "Development files for sofia-sip"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.18"

RPM_NAME = "sofia-sip-devel-1.13.18-1.1.aarch64.rpm"
RPM_HASH = "6f36d161c46b9eb1255750a61e89eb36746fc9445b3c61bf1fbbb4db489f916b16c729dee43c257b7dc20ffc99ef30c8bf3fa087b8d4aa199628dc5465c005ae"

RPROVIDES:${PN} += "pkgconfig-sofia-sip-ua \
pkgconfig-sofia-sip-ua-glib \
sofia-sip-devel"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/pkg-config \
glib2-devel \
libsofia-sip-ua-glib3 \
libsofia-sip-ua0 \
openssl-devel \
pkgconfig-glib-2.0 \
pkgconfig-sofia-sip-ua"

inherit rpm
