SUMMARY = "Development files for GLFW, an OpenGL application framework"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.5.1"

RPM_NAME = "libglfw-devel-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "9e5328445078419e595162b109f8a113ec7d9edb28052a4391b1ef62e90320ff7a7db61235b49fbc112f6462bc0c3416b34e79096936e8b61d1b4dcc9e2a18ff"

RPROVIDES:${PN} += "cmake-glfw3 \
libglfw-devel \
pkgconfig-glfw3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libglfw3 \
pkgconfig-gl"

inherit rpm
