SUMMARY = "Header-only C++ image library for graphics software"
DESCRIPTION = "OpenGL Image (GLI) is a header only C++ image library for graphics software. \
 \
GLI provides classes and functions to load image files (KTX and DDS), \
facilitate graphics APIs texture creation, compare textures, access texture \
texels, sample textures, convert textures, generate mipmaps, etc. \
 \
This library works with OpenGL or Vulkan but also ensures \
interoperability with other third-party libraries and SDKs. It is a \
candidate for software rendering (raytracing / rasterisation), image \
processing, image-based software testing or any development context that \
requires an image library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.8.2.0"

RPM_NAME = "gli-devel-0.8.2.0-6.5.aarch64.rpm"
RPM_HASH = "a2b27a82610372dd05e02f8e164050e52f989abf904a5fab2286d45397d0db1f64db0b1216ebfb82788237ad73f0f8374a3c92a96b7fee50a1abb83d6ae37a43"

RPROVIDES:${PN} += "cmake-gli \
gli-devel"

RDEPENDS:${PN} += ""

inherit rpm
