SUMMARY = "Development files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "wavpack-devel-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "e770cb57b8fc4126f125e0c12e24755207825016ff5e4011b590c3476e91627d27ce4b7ebc3f51b01d8b119ca2f1e55f9aa15b379d9db9ba3589b1f1dd77631b"

RPROVIDES:${PN} += "pkgconfig-wavpack \
wavpack-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
wavpack"

inherit rpm
