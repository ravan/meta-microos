SUMMARY = "Header files for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "cdd4a6703d7c5385ad61327a7334b4b138dfaaa9c5c94a58bc484b492bbd64bb2bd94bd2def2196a8d49d69a7dfc6265f55261497bde5ab77a38ac28abfcfeff"

RPROVIDES:${PN} += "avahi-devel \
libavahi-devel \
pkgconfig-avahi-client \
pkgconfig-avahi-core \
pkgconfig-avahi-libevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
glibc-devel \
libavahi-client3 \
libavahi-common3 \
libavahi-core7 \
libavahi-libevent1 \
pkgconfig-libevent"

inherit rpm
