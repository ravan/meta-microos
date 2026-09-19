SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-howl-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "715897a354df0dac7c3c3b9510f8358ecb7593b0090014eb223ed656051a99641450a1370615f91dfd3b5e6d37eabbc11280e69f568f2f96f3945f413ca63c1b"

RPROVIDES:${PN} += "avahi-compat-howl-devel \
pkgconfig-avahi-compat-howl \
pkgconfig-howl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libhowl0"

inherit rpm
