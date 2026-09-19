SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "libglfw2-2.7.6-3.9.aarch64.rpm"
RPM_HASH = "0db7337e97f8f845bd60a5e3a580e0c90346f5c7f9ff178efad301954d8b4a1dc2a6412f9e0382e77b05e21252d18f1c8bb11581cf3db5ad9f8cc049bb5aad65"

RPROVIDES:${PN} += "libglfw.so.2 \
libglfw2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
