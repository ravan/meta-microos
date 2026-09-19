SUMMARY = "Development files for the OGRE Runtime Shader System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Runtime Shader System \
(RTSS) component."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreRTShaderSystem-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "c4adb5e1f72454d26d2a146ed6050bf86b2e04244a232e4f275ee78b47996240f6749b8fbc8a02ea074b10f898fcc98a4e6f91e94358a04652babce509ffa9d5"

RPROVIDES:${PN} += "libOgreRTShaderSystem-devel \
pkgconfig-OGRE-RTShaderSystem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreRTShaderSystem13-6 \
pkgconfig-OGRE"

inherit rpm
