SUMMARY = "LibCVC API"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcvc0-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "59df8d1650bef44fceb02bb4c1c7ea5c8a0fd1adfd8716cbacce6d40d41b3fafb3bda85c8d35a016002935878059c72b7fc506e40323b9981c823823eeb64f8d"

RPROVIDES:${PN} += "libcvc.so.0 \
libcvc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
