SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "vte-tools-gtk4-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "60c6dc50a6e01f4dafc01cdb0fc8f251eddce7abbef041ce9b0abe7ba39624df1bd93989f944234a1c3df354b4fa9261d81e64be3364ff1031d791fbc5989cf1"

RPROVIDES:${PN} += "vte-tools-gtk4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libvte-2.91-gtk4.so.0"

inherit rpm
