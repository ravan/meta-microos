SUMMARY = "Development headers for the Ogre Paging Scene Manager component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height. \
 \
This package contains the development headers for the Paging Scene Manager \
component."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgrePaging-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "bc2e080a8dedfefe18660bc2f7c21a29c4f6331eb14b9bed489624325fd8559f735931d3b1ec41026ce9bea961e768ddb8f88731334b4554545dfa92fed39883"

RPROVIDES:${PN} += "libOgrePaging-devel \
pkgconfig-OGRE-Paging"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgrePaging13-6 \
pkgconfig-OGRE"

inherit rpm
