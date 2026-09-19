SUMMARY = "A system tray 'notification area' dockapp"
DESCRIPTION = "A very simple and light implementation of a system tray for any window \
manager supporting docking, conforming to the System Tray Freedesktop \
standard. \
 \
Peksystray provides a window where icons will automatically add up \
depending on the requests from the applications. Both the size of the \
window and the size of the icons can be selected by the user. If the \
window is full, it can automatically display another window in order \
to display more icons."
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "peksystray-0.4.0-23.9.aarch64.rpm"
RPM_HASH = "e474479c96893c37485345e601b4723056ef9d204cbadd4479a3d9cc395208ea562c02c5a9d3b2bbebc50676c06f93327bb99cc9628610e1af41e41d4996dc8d"

RPROVIDES:${PN} += "peksystray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
