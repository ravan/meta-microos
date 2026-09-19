SUMMARY = "Window Manager with a Taskbar -- Default Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "icewm-default-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "6d72331f112d16abc4b71353202c53860c9c70902ffde25943f31e64175629d3c5d8eda1bb322a4f371d2df9fc930af273c6ab2cc09dd7077fdd0df830b7fc4d"

RPROVIDES:${PN} += "icewm-bin \
icewm-default"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
adwaita-icon-theme \
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
libasound.so.2 \
libc.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librsvg-2.so.2 \
libsndfile.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
