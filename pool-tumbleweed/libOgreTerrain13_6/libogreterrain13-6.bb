SUMMARY = "Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
The Ogre Terrain System features: \
 \
* SceneManager independent, integrates with (optional) Paging component \
* Hierarchical geometry batching: batch count reduced at lower LODs as well as \
  vertex count. At the lowest level of detail, the entire terrain page is a \
  single batch which has obvious advantages for large paging terrains over the \
  fixed tiles previously used. \
* Skirts are used instead of stitching to avoid cracks in geometry. This means \
  fewer indexing arrangements and lower overall index buffer usage. \
* Built-in support for splatting layers, configurable sampler inputs and \
  pluggable material generators. \
* Support for generating global normal maps and light maps in a background \
  thread. \
* LOD now adapts in real-time to camera settings (viewport sizes & LOD bias) so \
  you can use the same terrain with multiple views efficiently."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreTerrain13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "3c26a24ad32fdade1fd5ac164d3161f2839ac32870b9eafea0489589bb53e819c403d86c95b103c8fd8f6075d670ecfa5b55412a63e10708d91545ef4b844200"

RPROVIDES:${PN} += "libOgreTerrain.so.13.6 \
libOgreTerrain13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libOgrePaging.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
