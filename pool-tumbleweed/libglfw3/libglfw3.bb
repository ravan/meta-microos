SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.5.1"

RPM_NAME = "libglfw3-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "6bdd3e451531db64203edc552bd6c70e15d14bf0ae9ba8d17c09f85c7731cc67a69305274042f98e2e96097f44c6f1ea5a9853b184e7e459d7fabf05a5c32c53"

RPROVIDES:${PN} += "libglfw.so.3 \
libglfw3 \
libglfw3-wayland"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
