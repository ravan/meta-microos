SUMMARY = "Development files for the OpenGL ES 2.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
OpenGL|ES 2.x provides an API for programmable hardware including \
vertex and fragment shaders. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 2.x APIs."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libGLESv2-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "2685233ec299b305cf4e681a93b50ab7303ae3894698885d9c654427571007cf8ed62538c2b624818d9b91dfd3bcff525896f0fe8a3a92bcf18e2eef88014522"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
pkgconfig-glesv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
