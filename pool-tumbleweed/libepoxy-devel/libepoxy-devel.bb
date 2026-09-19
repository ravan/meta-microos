SUMMARY = "Development files for libepoxy"
DESCRIPTION = "Epoxy is a library for handling OpenGL function pointer management for you. \
 \
It hides the complexity of dlopen(), dlsym(), glXGetProcAddress(), \
eglGetProcAddress(), etc. from the app developer, with very little knowledge \
needed on their part. They get to read GL specs and write code using undecorated \
function names like glCompileShader(). \
 \
Development files."
LICENSE = "MIT"

PV = "1.5.10"

RPM_NAME = "libepoxy-devel-1.5.10-2.11.aarch64.rpm"
RPM_HASH = "2667107d04d4b8dcfccfc99ccc91ff99cb5d0ae306a27cf58cb18e6d226418bbdaf80d3bb8606439e8d02670dcc89cc7bbda3a9b25364dde19ee860c32b8ff93"

RPROVIDES:${PN} += "libepoxy-devel \
pkgconfig-epoxy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libepoxy0 \
pkgconfig-egl \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
