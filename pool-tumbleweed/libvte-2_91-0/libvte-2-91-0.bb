SUMMARY = "Terminal Emulator Library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "libvte-2_91-0-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "82091e0a2d2305bf6c6b86596517817f973406639fd8ab38b24f0f714919958aa1aa50de77d21b48d3142c8592481a45fca2800e7701c9c9c02537741d4ed8ff"

RPROVIDES:${PN} += "config-libvte-2-91-0 \
libvte-2-91-0 \
libvte-2.91-gtk4.so.0 \
libvte-2.91.so.0 \
vte"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libicuuc.so.78 \
liblz4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0 \
libsimdutf.so.35 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
