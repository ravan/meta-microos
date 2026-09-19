SUMMARY = "ISC DHCP Relay Agent"
DESCRIPTION = "This is the ISC DHCP relay agent. It can be used as a 'gateway' for \
DHCP messages across physical network segments. This is necessary \
because requests can be broadcast, and they will normally not be \
routed."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-relay-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "5c98e2bd62b86ae93998b6f4ace128d29a4f1bea18ba72cca0f561d1b4bb1bfb511ffe8ef450061ff5d9cbea0ac02887735d19c2854afbd573b75380633b0c97"

RPROVIDES:${PN} += "dhcp-relay"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dhcp \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
