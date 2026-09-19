SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgrePaging13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "c376af7bf079ff82d5802194b8ae269bcc64ea2026039fbb7142c6e771e8a0732475d3d75257b8710f32ab7f64fc529ad544ea33a4c74b6950aef5ee7f066c72"

RPROVIDES:${PN} += "libOgrePaging.so.13.6 \
libOgrePaging13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
