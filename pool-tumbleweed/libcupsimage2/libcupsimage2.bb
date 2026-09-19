SUMMARY = "CUPS library for working with large images"
DESCRIPTION = "The CUPS imaging library provides functions for managing large \
images, doing colorspace conversion and color management, scaling \
images for printing, and managing raster page streams. It is used by \
the CUPS image file filters, the PostScript RIP, and all raster \
printers drivers."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "libcupsimage2-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "fb378b1ab6b67112824d3ac11c34ed3928ac1d6b86f295c1e06105bb5e820dcc2b1f013657aeb9fe1d7ecfe886123e7946c19827fc6b53f6f41664220211b90b"

RPROVIDES:${PN} += "libcupsimage.so.2 \
libcupsimage2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcups.so.2"

inherit rpm
