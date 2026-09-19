SUMMARY = "Introspection bindings for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing. \
 \
This package provides the GObject Introspection bindings for Avahi."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "typelib-1_0-Avahi-0_6-0.8-45.2.aarch64.rpm"
RPM_HASH = "bdcc22e3b2c3afd8c1f8ae6655e8ebc7fee117901b3cfc50e0709845001800c65190f21a37a6fec316b996fb891214c4659b6b655d63a517fe253e2847d41be3"

RPROVIDES:${PN} += "typelib-1-0-Avahi-0-6 \
typelib-Avahi \
typelib-AvahiCore"

RDEPENDS:${PN} += "libavahi-core.so.7 \
libavahi-gobject.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
