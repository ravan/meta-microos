SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "10.0"

RPM_NAME = "wine-staging-wow64-devel-10.0-1.2.aarch64.rpm"
RPM_HASH = "4992928fbab87417b54fc97fd25bc49025bbe361d8a5f24286a502f1c9af808c3968852a9d095b3c9da6943d407ca4fbb5e685bd4d62511e22efe836f468278a"

RPROVIDES:${PN} += "wine-devel \
wine-staging-wow64-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libOSMesa.so.8 \
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
libvulkan.so.1"

inherit rpm
