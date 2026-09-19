SUMMARY = "Window Manager with a Taskbar"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "icewm-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "813dc5677acbc3e61b935ddeeed4a1d47c5b90ffa4bcc5b1c16a053e9138f4531c403e775ad9517d522ba47957a1a2588430441c156ef951afd9fd4e56d0d331"

RPROVIDES:${PN} += "icewm \
icewm-gnome \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
alsa-utils \
desktop-data \
icewm-bin \
icewm-configuration-files \
imlib2-loaders \
update-alternatives \
xdg-menu \
xterm-bin"

inherit rpm
