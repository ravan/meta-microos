SUMMARY = "Support for infrared cameras that are not directly enabled out-of-the box"
DESCRIPTION = "linux-enable-ir-emitter provides support for infrared cameras that are not \
directly enabled out-of-the box (at the very least, the kernel must recognize \
your infrared camera). It can automatically configure almost any (UVC) infrared \
emitter."
LICENSE = "MIT"

PV = "6.1.2"

RPM_NAME = "linux-enable-ir-emitter-6.1.2-1.9.aarch64.rpm"
RPM_HASH = "998899292a7f9c15e74e44e13b3a9496b276427d5a881ad3a356256c2fee292c679280e8b17cba0caf00b52aef9aad8e2515b669e01eb44e863b584027771efd"

RPROVIDES:${PN} += "linux-enable-ir-emitter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-highgui.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
