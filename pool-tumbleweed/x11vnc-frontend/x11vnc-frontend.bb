SUMMARY = "Simple GUI Frontend to x11vnc"
DESCRIPTION = "x11vnc allows one to remotely view and interact with real X displays (i.e. a \
display corresponding to a physical monitor, keyboard, and mouse) with any VNC \
viewer. In this way it plays the role for Unix/X11 that WinVNC plays for \
Windows. \
 \
This package adds a simple GUI frontend to run x11vnc."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.17"

RPM_NAME = "x11vnc-frontend-0.9.17-1.2.aarch64.rpm"
RPM_HASH = "e3b8dd99c4f3671ff1a5f3eb1a4fbcfbefe4d5cc18bb8676f5e5ede4ab6e051695ff65418778b18f517e01fd9360319c5fe98d8f244b3762dd71eb3c12f1d8b6"

RPROVIDES:${PN} += "x11vnc-frontend"

RDEPENDS:${PN} += "/usr/bin/sh \
tcl \
tk \
x11vnc"

inherit rpm
