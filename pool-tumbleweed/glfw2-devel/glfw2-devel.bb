SUMMARY = "Development files for GLFW, an OpenGL application framework"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "glfw2-devel-2.7.6-3.9.aarch64.rpm"
RPM_HASH = "ec09472397a20ed27f996cc6a9426c06e38650c4f7b6e5b656424d8f17a34e4a0b6dc3478797dcf94ec0c142bb46f190f55eea131fce54336058965542f20149"

RPROVIDES:${PN} += "glfw2-devel \
pkgconfig-libglfw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglfw2 \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xrandr"

inherit rpm
