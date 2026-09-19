SUMMARY = "Development files for the OpenGL ES 1.x Common Profile API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
OpenGL|ES 1.x provides an API for fixed-function hardware. \
 \
This package provides a development environment for building programs \
using the OpenGL|ES 1.x Common Profile APIs."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libGLESv1_CM-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "fb40bd0f9da16613f8e95aa860ec2116d94b25d7c44970611fa9adb83b83b4d84a517db5ef900b7fd50423d7775bcf8bf18bc1b82eccf5119de99bde14c706b3"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
