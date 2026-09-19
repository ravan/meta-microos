SUMMARY = "Shared library for Open Image Denoise library"
DESCRIPTION = "Intel Open Image Denoise is an open source library of high-performance, \
high-quality denoising filters for images rendered with ray tracing. \
 \
This package holds the main shared library."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "libOpenImageDenoise2-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "4c08a27775766368ddb23bcdffc9b3f10402ee404866ff4263307f0bd3cc6f4df1edc874a279d4460f38569247bb96c769bf0d1ec99e6e83cf0688783fef9217"

RPROVIDES:${PN} += "libOpenImageDenoise.so.2 \
libOpenImageDenoise2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libOpenImageDenoise-core.so.2.5.1 \
libOpenImageDenoise-core2-5-1 \
libOpenImageDenoise-device-cpu2-5-1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
