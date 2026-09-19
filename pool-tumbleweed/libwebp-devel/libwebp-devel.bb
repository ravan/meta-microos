SUMMARY = "Development files for libwebp, a library for the WebP format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebp-devel-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "975549fefbe2205956ea0045979013a0c98a6c799082cbb62fc0fb7cee04a47580df06bc27b39e27f0c10d974a88e8c02a2b8884f8a0f50de078b37cc5e49ed5"

RPROVIDES:${PN} += "libwebp-devel \
pkgconfig-libsharpyuv \
pkgconfig-libwebp \
pkgconfig-libwebpdecoder \
pkgconfig-libwebpdemux \
pkgconfig-libwebpmux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsharpyuv0 \
libwebp7 \
libwebpdecoder3 \
libwebpdemux2 \
libwebpmux3 \
pkgconfig-libsharpyuv \
pkgconfig-libwebp"

inherit rpm
