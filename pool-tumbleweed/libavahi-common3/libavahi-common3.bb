SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-common3-0.8-45.2.aarch64.rpm"
RPM_HASH = "0d07bf8e41b282d19754409a1a5adaef95c53df46257c1b0fb334a6a820889c2b2529a415ae559b847feddceb382e79601ecaa90fe7946604054b1fa47bc7798"

RPROVIDES:${PN} += "libavahi-common.so.3 \
libavahi-common3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
