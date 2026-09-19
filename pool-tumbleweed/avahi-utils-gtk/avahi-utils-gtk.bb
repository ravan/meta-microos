SUMMARY = "GTK+ Utilities for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-utils-gtk-0.8-45.2.aarch64.rpm"
RPM_HASH = "51fba56911e3b8e8fe20622061b9efc3467df88415a1c0ae501e5493a1151321a959d51e873fed22e40d061e2f67e6e5f68b56f9e0805e277c7a72b7bb2f2ce9"

RPROVIDES:${PN} += "avahi-glib2-utils-gtk \
avahi-utils-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
avahi \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-core.so.7 \
libavahi-glib.so.1 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
