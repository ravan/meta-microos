SUMMARY = "Development files for libxtrxdsp"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxdsp."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp-devel-0.0.0+git.20190830-2.16.aarch64.rpm"
RPM_HASH = "639a5739261cdb755c9c983b58bcea48fa257c692006060ad2f64a485c65c07d1a0d750f046320d856acf92e0636b3541f8d8411356f38bb2761c5b0c8821276"

RPROVIDES:${PN} += "libxtrxdsp-devel \
pkgconfig-libxtrxdsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxdsp0"

inherit rpm
