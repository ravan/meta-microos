SUMMARY = "Library package for libopusenc"
DESCRIPTION = "A library that provides a way to encode Ogg Opus files."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "libopusenc0-0.3-1.4.aarch64.rpm"
RPM_HASH = "6c99cc9a1cb6b621ecb50553614aacb995a593e3f7503c1dc0925f0e1c94384947b88be0198557bf55c98476e849da7233ff05a38c5bfc00e494af81beba9c24"

RPROVIDES:${PN} += "libopusenc.so.0 \
libopusenc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopus.so.0"

inherit rpm
