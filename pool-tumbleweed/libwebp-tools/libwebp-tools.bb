SUMMARY = "The WebP command line tools"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebp-tools-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "907f56b61f756f16d711453c1cdc6011acab965d10d51c0b8d2ee20c91ffe2d9c0adf6c7938246baf574d119b4b49a456936affcc9a8c2091d1d1cd5038b1ab6"

RPROVIDES:${PN} += "libwebp-tools \
webp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libsharpyuv.so.0 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
