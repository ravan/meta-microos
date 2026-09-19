SUMMARY = "Samba share extension for Nemo file manager"
DESCRIPTION = "Nemo Share allows you to quickly share a folder from the Cinnamon \
Nemo file manager without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-share-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "9bd03d6b3efa0e02ddaabc56195f267f2eec8b7ea1df4e94743ccbf153049aa96ea3c420eafa6f4618957a95ca80c485cccb4cfac0f1a221409a2c724d1b3a48"

RPROVIDES:${PN} += "libnemo-share.so \
nemo-extension-share \
nemo-share"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
