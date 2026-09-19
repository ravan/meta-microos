SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-mDNSResponder-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "458cd633081792617a9127c6981af3a102ac92b2d8dcda88873e0435137ea707441bc41b0e1d9d9d3f17183bb3dc4ad49da0452e7e6fd9520b6a7a700f437362"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder-devel \
mDNSResponder-devel \
pkgconfig-avahi-compat-libdns-sd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libdns-sd"

inherit rpm
