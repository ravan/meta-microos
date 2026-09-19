SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c7130b4239b2c8b2fbc6cbbb915396b80d0ae543f5516d87becb58ef060c95a7e2d9a60011e65516f76691a34ca3aaab8117a649f62b58bc28f1dafb831ba000"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticleEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
