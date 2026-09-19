SUMMARY = "Required media files for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the required media files for OGRE, optional files are provided \
with the ogre-demos package."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-media-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "63682de39dfda5dde670c2892c53b5ae1c66f202d208acd71175be51d33c12f450b34ac757b21be3287da79bf4468ad062fc55b585d1352f787ffac236cd355b"

RPROVIDES:${PN} += "ogre-media"

RDEPENDS:${PN} += ""

inherit rpm
