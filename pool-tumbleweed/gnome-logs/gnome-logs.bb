SUMMARY = "GNOME System Log Viewer"
DESCRIPTION = "A utility for viewing detailed event logs for the system."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-logs-50.0-1.3.aarch64.rpm"
RPM_HASH = "5647fdb9c85af541825e2adb6817422eb75c2021544c857140f21a73e4217b379467b8e31a88f1c6f403ca8b0806c6b38d8c4aa5816098e2ba72b9c4b076aa27"

RPROVIDES:${PN} += "gnome-logs"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libsystemd.so.0"

inherit rpm
