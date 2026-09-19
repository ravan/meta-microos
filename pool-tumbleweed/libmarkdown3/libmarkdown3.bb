SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.2.0"

RPM_NAME = "libmarkdown3-3.0.2.0-1.1.aarch64.rpm"
RPM_HASH = "fa24b9c2c4208d0d2144c30f67122e5a766fb322f8aa4a10ff734001264adf8098ac1ae97807e7c510a82b0a739b29aef78d4c99bbcfc47f89855d0dd8e2ade7"

RPROVIDES:${PN} += "libmarkdown.so.3 \
libmarkdown3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
