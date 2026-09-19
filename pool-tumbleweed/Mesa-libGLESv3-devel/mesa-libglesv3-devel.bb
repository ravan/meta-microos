SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libGLESv3-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "5d7a731ba9a7b2d9a6a26176c516ed26fab964aa8d862151c10ee97745698d6ecc4ef67b9dcd130458ba32fd05c100bc1092a6f7db97c946fd8f1a3660ad0155"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
