SUMMARY = "Development files for the libfec library"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfec."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "fec-devel-3.0.0+git.20160910-6.8.aarch64.rpm"
RPM_HASH = "2bdf085e9a1d5ac77cde6e3fa64ad3fb0366ad8f273d206bb3377714a71182cc0d92d3b86f05ef421766c41c7352793b4492ee6487a349044a06e5e3235fbad2"

RPROVIDES:${PN} += "fec-devel \
pkgconfig-libfec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfec3"

inherit rpm
