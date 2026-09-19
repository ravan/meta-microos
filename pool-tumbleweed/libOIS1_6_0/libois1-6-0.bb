SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libOIS1_6_0-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "fe606b7c9a9b989630e071d8748a44de5cd95c84a78fd5592b54e1d1b0f4d4ab5447b888b7126af8f64c688e3f3e7fc1a94465a343a7c108de1960c321e96505"

RPROVIDES:${PN} += "libOIS.so.1.6.0 \
libOIS1-6-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
