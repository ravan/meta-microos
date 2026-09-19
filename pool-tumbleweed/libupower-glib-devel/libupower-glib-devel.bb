SUMMARY = "Power Device Enumeration Framework - Development Files"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.91.3"

RPM_NAME = "libupower-glib-devel-1.91.3-1.2.aarch64.rpm"
RPM_HASH = "f22c88976f8b41a9c8fab34505e670aee836d6df25f2e90c07c7171a0438dadc98dbe010ec7515f0cb6e67494eb9255c5c96c2136793137a23d555287c3520d8"

RPROVIDES:${PN} += "libupower-glib-devel \
pkgconfig-upower-glib \
upower-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupower-glib3 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-polkit-gobject-1 \
typelib-1-0-UpowerGlib-1-0"

inherit rpm
