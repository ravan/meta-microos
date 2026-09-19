SUMMARY = "Qt 6 Quick3DPhysicsHelpers library"
DESCRIPTION = "The Qt 6 Quick3DPhysicsHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DPhysicsHelpers6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "35480475ef70d80bb1efac0c265d6413cae7160cbff5178e1b9cafdb1cd56289edca282302c0fa49e3d29e851042b812c0ca0384b667582a840de048bf018950"

RPROVIDES:${PN} += "libQt6Quick3DPhysicsHelpers.so.6 \
libQt6Quick3DPhysicsHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
