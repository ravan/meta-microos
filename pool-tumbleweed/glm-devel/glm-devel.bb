SUMMARY = "Header only C++ mathematics library for graphics"
DESCRIPTION = "OpenGL Mathematics (GLM) is a header only C++ mathematics library for graphics \
software based on the OpenGL Shading Language (GLSL) specification. \
 \
GLM provides classes and functions designed and implemented with the same naming \
conventions and functionalities than GLSL so that when a programmer knows GLSL, \
he knows GLM as well which makes it really easy to use."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.0.1"

RPM_NAME = "glm-devel-1.0.1-1.5.noarch.rpm"
RPM_HASH = "38f5c0fd88b98e40e6c809818a79d3447d76e68b1682b8b3291913fdb36cc42d3b1964c604c1f7be7573d6593d9f4edaed172b26ef715f9b05e269011e47848e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-glm \
glm-devel \
pkgconfig-glm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake"

inherit rpm
