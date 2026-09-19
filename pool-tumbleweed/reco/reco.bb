SUMMARY = "Audio Recording App"
DESCRIPTION = "An audio recording app designed for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.1"

RPM_NAME = "reco-5.2.1-1.2.aarch64.rpm"
RPM_HASH = "647b55c52df917bebec249c5c761ed8452fb19711fff94fe8e9b64ae46955152c08f7de6c8ded74031867c4cf70a482bc99a27fb897086aa7e1d515891ecfd00"

RPROVIDES:${PN} += "reco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
liblivechart-2.so.2 \
libm.so.6 \
libryokucha.so.0"

inherit rpm
