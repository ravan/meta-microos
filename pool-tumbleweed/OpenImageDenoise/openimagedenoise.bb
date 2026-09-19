SUMMARY = "Open Image Denoise library"
DESCRIPTION = "Intel Open Image Denoise is an open source library of high-performance, \
high-quality denoising filters for images rendered with ray tracing."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "OpenImageDenoise-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "0f40f8b4a3b267cd2c311b46786b9703f23bb44acd2b9b4b3f8bea4116937d8041eb49110472491868739247370481ea674b4b6c18841b773291d2c2ac592efb"

RPROVIDES:${PN} += "OpenImageDenoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenImageDenoise.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
