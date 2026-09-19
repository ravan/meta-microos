SUMMARY = "Power Device Enumeration Framework"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.91.3"

RPM_NAME = "upower-1.91.3-1.2.aarch64.rpm"
RPM_HASH = "923f35ef3726f8048d8d26220f2694e4be6dac5963b2569b342549768efb884b433a862f6cc1d12f3e0cc78abc30293555ce425c418ec0ace848ee2cfb1089b2"

RPROVIDES:${PN} += "config-upower \
upower"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3 \
systemd"

inherit rpm
