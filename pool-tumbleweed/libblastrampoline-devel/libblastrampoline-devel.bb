SUMMARY = "Headers for libblastrampline, a BLAS/LAPACK demuxer"
DESCRIPTION = "libblastrampoline is a BLAS/LAPACK demuxer library that uses PLT \
trampolines and implements a consistent API atop BLAS implementations. \
 \
This package contains the headers for libblastrampoline."
LICENSE = "MIT"

PV = "5.15.0"

RPM_NAME = "libblastrampoline-devel-5.15.0-1.3.aarch64.rpm"
RPM_HASH = "27a7c1150db7e01330e8b899f1d5957174945759c5d68e97b53d14d23bb5300e461ff5e1f111526d74c30f0d3bd2d9bdf2629ebb3a7febefafc0c6e60d5e8970"

RPROVIDES:${PN} += "libblastrampoline-devel"

RDEPENDS:${PN} += "libblastrampoline5"

inherit rpm
