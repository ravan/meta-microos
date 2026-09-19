SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries. \
 \
%_win_debug_package"
LICENSE = "LGPL-2.1-or-later"

PV = "11.17"

RPM_NAME = "wine-devel-11.17-1.1.aarch64.rpm"
RPM_HASH = "14b6ea069ae805212ab069c38025c0418dbcc66867559fa438d189631b76eddf7c14c73da254934d9463897196da9b412b044c6b8615b94f04999389abafaa33"

RPROVIDES:${PN} += "wine-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libnetapi.so.1 \
libodbc.so.2 \
libv4l2.so.0 \
libvulkan.so.1 \
libxkbregistry.so.0"

inherit rpm
