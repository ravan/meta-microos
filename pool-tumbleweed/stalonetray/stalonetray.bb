SUMMARY = "Stand-alone freedesktop.org system tray"
DESCRIPTION = "Stalonetray is a stand-alone freedesktop.org and KDE system tray (notification \
area) for X Window System/X11 (e.g. X.Org or XFree 86). It has full XEMBED \
support and minimal dependencies: an X11 lib only. Stalonetray works with \
virtually any EWMH-compliant window manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "stalonetray-0.8.5-1.11.aarch64.rpm"
RPM_HASH = "9f2e8c56fcbc6090073214fc5587db49d976f3780ae6d00962493702810f88277f8c8d2f2c986c3be5f0feeb726b5de42dbf075aee362d44ffe8dd420ea19859"

RPROVIDES:${PN} += "stalonetray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
