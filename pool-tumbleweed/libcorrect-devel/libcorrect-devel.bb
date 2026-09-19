SUMMARY = "Development files for libcorrect"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcorrect."
LICENSE = "BSD-3-Clause"

PV = "20181010"

RPM_NAME = "libcorrect-devel-20181010-1.6.aarch64.rpm"
RPM_HASH = "1eef9a1bf513b75980d2a7de5b6678e31be83fc606428d2b3dd33e25514035cb65e5ecf92ff743a4881ac8423982105ee7241d7de1809d176b961ce8a8fd5ec2"

RPROVIDES:${PN} += "libcorrect-devel \
pkgconfig-libcorrect"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcorrect0-0-0"

inherit rpm
