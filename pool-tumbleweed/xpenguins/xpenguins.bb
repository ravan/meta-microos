SUMMARY = "Cute little penguins that walk along the tops of your windows"
DESCRIPTION = "This program animates a friendly family of penguins on your root \
window. They drop in from the top of the screen, walk along the tops of \
your windows, up the sides of your windows, up the side of the screen, \
and sometimes even levitate with their genetically-modified \
go-go-gadget 'copter ability."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "xpenguins-3.2.4-2.1.aarch64.rpm"
RPM_HASH = "46a6093a49d2a5eb53fb9e96d41a9712a925a9d0351cc7b67a2ae541e1c8d4b0a3363f185d334dc6f78dc7c26fa426035349f64345514ac3d22bd03714ef614a"

RPROVIDES:${PN} += "xpenguins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
