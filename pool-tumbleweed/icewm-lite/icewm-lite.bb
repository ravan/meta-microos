SUMMARY = "Window Manager with a Taskbar -- Lite Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "icewm-lite-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "c43c75ce35e57516be493cec87a405d8617bee24b5a4c53ed2f1749a62d24c5fa7d6bcfc8abd49656d6118b114b72628819e0841c18bb0ac4a263cb98910bfe7"

RPROVIDES:${PN} += "icewm-bin \
icewm-lite"

RDEPENDS:${PN} += "/usr/bin/sh \
icewm \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libImlib2.so.1 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
