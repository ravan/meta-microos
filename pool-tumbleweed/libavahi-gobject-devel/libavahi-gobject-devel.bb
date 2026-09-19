SUMMARY = "Header files for Avahi's GObject bindings"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-gobject-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "58a57b5b34896abcff5013af12260661c424724b76f464c8f022cd7ba0c9a1613c2ed4d62ef62b17ca6977cc5d0874c3b754ddd7bc0ec2c50f955ce28e5e07c9"

RPROVIDES:${PN} += "libavahi-gobject-devel \
pkgconfig-avahi-gobject"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libavahi-devel \
libavahi-glib-devel \
libavahi-gobject0 \
pkgconfig-avahi-client \
pkgconfig-avahi-glib \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
