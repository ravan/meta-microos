SUMMARY = "Library for reading/adding data to WebP container files"
DESCRIPTION = "The WebP Mux API contains methods for adding data to and reading data \
from WebP files. This API currently supports XMP/EXIF metadata, ICC \
profile and animation."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebpmux3-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "f161703431fd52659a335d97443833b250e8976d2a659915737d3a9b84ec6e121d1772c6d01aecdda739c54b9b958eec569890733b4ed2b62535ef589769f749"

RPROVIDES:${PN} += "libwebpmux.so.3 \
libwebpmux3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwebp.so.7"

inherit rpm
