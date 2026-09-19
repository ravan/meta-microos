SUMMARY = "Math functions for the Color Transformation Language"
DESCRIPTION = "The IlmCtlMath library contains fixed colorspace transforms \
(RGB/XYZ/Luv/Lab), LUTs, matrix computation and interpolation code."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "libIlmCtlMath1_5-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "495599636853ba1c8755a68266100c733b919d5e49d062c1d4182aa22cc21f4253a81abf5e36df7e0a2df900359eb17bd1680c393247d028b7ae54302c442ff3"

RPROVIDES:${PN} += "libIlmCtlMath.so.1.5 \
libIlmCtlMath1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ctl-data \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
