SUMMARY = "Graphical front end for fio"
DESCRIPTION = "gfio is a gtk based graphical front-end for fio.  It is often installed on the \
testers workstation whereas fio would be installed on the server."
LICENSE = "GPL-2.0-only"

PV = "3.42"

RPM_NAME = "gfio-3.42-1.3.aarch64.rpm"
RPM_HASH = "856d93f076d7b28c266ee288f2d9959764f4b73dd86ed8fccfc76ea807b3551094dc4c178c3d88093f585bad95a66f223185749ff8e857a93f2fc6e8f0c7f67c"

RPROVIDES:${PN} += "gfio"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiscsi.so.11 \
libm.so.6 \
libnbd.so.0 \
libnuma.so.1 \
librados.so.2 \
librbd.so.1 \
libz.so.1"

inherit rpm
