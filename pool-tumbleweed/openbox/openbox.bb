SUMMARY = "ICCCM and EWMH Compliant Window Manager with Very Few Dependencies"
DESCRIPTION = "Openbox is a window manager for the X Window System. It currently runs \
on a large list of platforms. It was originally based on Blackbox, but \
is, since version 3.0, a complete reimplementation with these features, \
among others: \
 \
o ICCCM and EWMH compliance o Chainable key bindings o Customizable \
mouse actions o Window resistance o Multihead Xinerama support o Pipe \
menus \
 \
The configuration tool 'obconf' is recommended along with this package."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "54336575825122977c1c2b45a7e6ee60f80a88ea14c7e156aeb845c4628cc7512186857197e8aafa0aa99a9f2d4041332b242fd9cc6990b2d06e29968ed17f8c"

RPROVIDES:${PN} += "config-openbox \
openbox \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstartup-notification-1.so.0 \
xdg-menu \
xsltproc"

inherit rpm
