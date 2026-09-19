SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libdns_sd-0.8-45.2.aarch64.rpm"
RPM_HASH = "9bd466406f71df0bc4c94fb423d970afdc116a141f0f8b30674a13de27d3eee6868ff622a2419023b533421c2243ed6575f939b185a151b31bff129b3c10186d"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder \
libdns-sd \
libdns-sd.so \
libdns-sd.so.1 \
mDNSResponder-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
