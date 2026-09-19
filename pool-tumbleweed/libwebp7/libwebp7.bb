SUMMARY = "Library for the WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebp7-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "ea68d6b68ac16eca254ccc59ea4a1967f3a37103e438844399ffa21f48a0b3260c06d3e4565c987b0268c0b7a9a2762ed3822bf4069af77ba8d62c95620c7377"

RPROVIDES:${PN} += "libwebp.so.7 \
libwebp7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsharpyuv.so.0"

inherit rpm
