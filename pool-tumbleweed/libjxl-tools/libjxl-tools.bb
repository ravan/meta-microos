SUMMARY = "Command-line utilities to convert from/to JPEG XL"
DESCRIPTION = "Command-line utilities to convert from/to JPEG XL."
LICENSE = "BSD-3-Clause"

PV = "0.11.2"

RPM_NAME = "libjxl-tools-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "8b88d83e5a99c235c0ff321295bb8ac7bf27e03f6be12b96b090105b2bc14730e4d20bfbb23692492672f007c9ea470f8d51771a7b9c7cb6de6965b3310e037e"

RPROVIDES:${PN} += "libjxl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libavif.so.16 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libhwy.so.1 \
libjpeg.so.8 \
libjxl-cms.so.0.11 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
