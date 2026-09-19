SUMMARY = "Header files for Avahi's Glib bindings"
DESCRIPTION = "GLib support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-glib-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "df54c001d266cce70ae307347cccc925637001d99f34a796a335c7454b8922b2aa962314a25d5d9c1a0b1a7c3beed89c5cbffa9bb8688c5c198366bbe81c0b7d"

RPROVIDES:${PN} += "avahi-devel-/usr/lib64/libavahi-glib.so \
libavahi-glib-devel \
pkgconfig-avahi-glib \
pkgconfig-avahi-ui-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-glib1 \
libavahi-ui-gtk3-0 \
pkgconfig-avahi-client \
pkgconfig-avahi-glib \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Avahi-0-6"

inherit rpm
