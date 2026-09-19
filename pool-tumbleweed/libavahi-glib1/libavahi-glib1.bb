SUMMARY = "Glib Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "GLib support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-glib1-0.8-45.2.aarch64.rpm"
RPM_HASH = "a8d5bacc0cd4ae2933fe77ebeab061f08e1ce0207cb2b8a96b95b3fc00657a26871f32f6f76b6178d305de739051036eff7c146de63502ef813da7461802f1a7"

RPROVIDES:${PN} += "avahi-glib \
libavahi-glib.so.1 \
libavahi-glib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-common.so.3 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
