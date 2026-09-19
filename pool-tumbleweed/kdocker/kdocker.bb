SUMMARY = "KDocker will help you dock any application into the system tray"
DESCRIPTION = "KDocker will help you dock any application in the system tray. This means you \
can dock openoffice, firefox, thunderbolt, eclipse, anything! \
Just point and click. Works for both Plasma and GNOME (In fact it should work \
for most modern window managers that support NET WM Specification. \
 \
All you need to do is start KDocker and select an application using the mouse \
and the application gets docked into the system tray. \
The application can also be made to dissappear from the task bar."
LICENSE = "GPL-2.0-or-later"

PV = "6.2"

RPM_NAME = "kdocker-6.2-1.9.aarch64.rpm"
RPM_HASH = "f902f11dba0f59ce802d2aac27d7559beb593274f12f0d42d3c60e015d7c74c6495a9ddcc2f4f9c36445fec8bc0b79995f7d5a9e1f9cb6c1a400605ed65eb4f1"

RPROVIDES:${PN} += "kdocker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
