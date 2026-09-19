SUMMARY = "Nautilus extension adding 'Open Terminal' as folder action"
DESCRIPTION = "This is a nautilus extension that allows you to open a terminal in \
arbitrary folders."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.60.0"

RPM_NAME = "nautilus-extension-terminal-3.60.0-1.2.aarch64.rpm"
RPM_HASH = "c83d1898e8c104608e2357d0eb3fe77289a6bad32626c5957fd5b28aeaa6c4e1ed78e7774fa427d6eb4491d70adecd8f1ed4b608c26aa34fadf71a9ff270220d"

RPROVIDES:${PN} += "libterminal-nautilus.so. \
nautilus-extension-terminal \
nautilus-open-terminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libstdc++.so.6"

inherit rpm
