SUMMARY = "Development files for the cm256cc library"
DESCRIPTION = "This is the rewrite in (as much as possible) clean C++ of cm256. \
cm256cc is a simple library for erasure codes. From given data it \
generates redundant data that can be used to recover the originals. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcm256cc."
LICENSE = "BSD-3-Clause & GPL-3.0-only & MIT"

PV = "1.1.2"

RPM_NAME = "cm256cc-devel-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "2811c44a28d5da82727909e5484852d935df8689876bffe898fbd17df75ecd7ef096429a163e61d7ed50b4ad5250f9677f932350503d104e8434ab942e39e404"

RPROVIDES:${PN} += "cm256cc-devel \
pkgconfig-libcm256cc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcm256cc1"

inherit rpm
