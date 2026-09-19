SUMMARY = "GLX-based demos"
DESCRIPTION = "This package contains some common GLX-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-x-9.0.0-7.5.aarch64.rpm"
RPM_HASH = "536b0382e0164da2eee6b16b5de41eea5678cfcdf4d78040c04be7677d77564d7c8c68ca241fc6b24035a0fe2fd36be90f4f437e0a4a4dfb1c059abcf4f87328"

RPROVIDES:${PN} += "Mesa-demo-x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
