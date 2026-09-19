SUMMARY = "YUV scaling and conversion library"
DESCRIPTION = "libyuv is a project for YUV image scaling and conversion."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv0-20230517+a377993-2.5.aarch64.rpm"
RPM_HASH = "65d96ca6c7109c56efa75b78a88e3d644f5eefa57eed0f973deb1e1a8fe2469bf0d77ef7f7ef706ae956ec9926ed1f0574e506158fa3a3151784804a542e96af"

RPROVIDES:${PN} += "libyuv.so.0 \
libyuv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
