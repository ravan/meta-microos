SUMMARY = "Development files for the Ogre Property component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the property component."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreProperty-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "a3e22db1a37194c4856789bb4ccb0813adb6c984840fd3bdfdc34d48c1d1f80ba6a10cf531d6ec1dffe2ce515ac91d960d0a9d2c4ca9cbf3de299acbba4861ef"

RPROVIDES:${PN} += "libOgreProperty-devel \
pkgconfig-OGRE-Property"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreProperty13-6 \
pkgconfig-OGRE"

inherit rpm
