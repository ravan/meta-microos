SUMMARY = "VNC Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-vnc-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "f45b5a98c8c7cd3539871fd34f07ccb08fb66fe6a77d6aa001330eebd159effa94aa0c06068d5e1b538868444e2b0ac6ebf73750984fc24081a16c0668645335"

RPROVIDES:${PN} += "remmina-plugin-vnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libvncclient.so.1 \
remmina"

inherit rpm
