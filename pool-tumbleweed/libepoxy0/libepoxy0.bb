SUMMARY = "OpenGL function pointer management library"
DESCRIPTION = "Epoxy is a library for handling OpenGL function pointer management for you. \
 \
It hides the complexity of dlopen(), dlsym(), glXGetProcAddress(), \
eglGetProcAddress(), etc. from the app developer, with very little knowledge \
needed on their part. They get to read GL specs and write code using undecorated \
function names like glCompileShader()."
LICENSE = "MIT"

PV = "1.5.10"

RPM_NAME = "libepoxy0-1.5.10-2.11.aarch64.rpm"
RPM_HASH = "3e8d746e9156fd3bea41c346d6c3823b9caf343dcb0e2ee933b2dc6da1998fab02f6fe36371347f319a217dbf8a416430c1b2de9c4630eea2a64921eec055ed2"

RPROVIDES:${PN} += "libepoxy.so.0 \
libepoxy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
