SUMMARY = "Library for decoding WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebpdecoder3-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "407e7f8534e06b1a077b8b8b56d61738586accc8e9799c8d13faef110df836e495e1094122251b1eb73c36a9ac56be2210157f878914084e9165ffdd34131d43"

RPROVIDES:${PN} += "libwebpdecoder.so.3 \
libwebpdecoder3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
