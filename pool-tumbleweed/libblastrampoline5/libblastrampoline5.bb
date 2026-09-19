SUMMARY = "BLAS/LAPACK demuxer library using PLT trampolines"
DESCRIPTION = "libblastrampoline is a BLAS/LAPACK demuxer library that uses PLT \
trampolines and implements a consistent API atop BLAS implementations \
(like OpenBLAS, MKL, etc.) that differ in their function argument \
types (e.g. 32-bit vs. 64-bit array indices) and/or function names \
(dgemm vs. dgemm_)."
LICENSE = "MIT"

PV = "5.15.0"

RPM_NAME = "libblastrampoline5-5.15.0-1.3.aarch64.rpm"
RPM_HASH = "5e8864b918a20f64779999e1470b5df94b06f0d446bcafd1e8ff633dbdbc41a087a7f3d6d7f3868d0d68f60d2b0b29cb003d91be210e43a6e70fb090f445fb26"

RPROVIDES:${PN} += "libblastrampoline.so.5 \
libblastrampoline5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
