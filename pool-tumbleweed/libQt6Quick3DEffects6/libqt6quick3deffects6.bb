SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DEffects6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5fcdea2a57a9ce5ebb11a5d5c08cc437a704430d9e5e94ccb70e30df8adb396a8f68994f7cb3512e309151dba28cf61918be536c7dcaee91a8c67c25d7c7cd5e"

RPROVIDES:${PN} += "libQt6Quick3DEffects.so.6 \
libQt6Quick3DEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
