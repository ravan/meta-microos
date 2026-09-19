SUMMARY = "Qt 6 3DLogic library"
DESCRIPTION = "The Qt 6 3DLogic library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DLogic6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "21d45955730f7b12906b53c9f3cdb4179bd66057c27513c53dea63cc078ff66bc5775dd4d8a0dff49ffa1daf03373e30e9443c28155304fa791a414da91c3d00"

RPROVIDES:${PN} += "libQt63DLogic.so.6 \
libQt63DLogic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
