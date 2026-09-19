SUMMARY = "Shared library for Open Image Denoise library"
DESCRIPTION = "Intel Open Image Denoise is an open source library of high-performance, \
high-quality denoising filters for images rendered with ray tracing. \
 \
This package holds the device cpu sub shared library."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "libOpenImageDenoise_device_cpu2_5_1-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "8ef3168ed038350c33a498262b414999b7152fd2ff2e1bd9dfe2118c5480c0fc07a1b0ae09b2e1113aa7661ccb7c3a616ef00a02384e358afc3c8ebeb6b76093"

RPROVIDES:${PN} += "libOpenImageDenoise-device-cpu.so.2.5.1 \
libOpenImageDenoise-device-cpu2-5-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenImageDenoise-core.so.2.5.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
