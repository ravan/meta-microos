SUMMARY = "Network UPS Tools Web Server Support (UPS Status Pages)"
DESCRIPTION = "Web server support package for the Network UPS Tools. \
 \
Predefined URL is http://localhost/nut/index.html \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-cgi-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "27b2e1cc5638e4dc4d2cedf0f1a66b9c99bccf8060a3b6b6d7ac4e4eb31255eb0011062f71729bf93f5d9740e7548c9e0c59772ff9fe59847103cf84fc6fe575"

RPROVIDES:${PN} += "config-nut-cgi \
nut-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libnutprivate-2-8-5-common-client.so.1 \
libupsclient.so.7 \
nut"

inherit rpm
