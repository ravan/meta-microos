SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC-devel-1.6.8-4.20.aarch64.rpm"
RPM_HASH = "ec56555e103f2814349b43215628880b53017ec10c33729c8d4f1d32fcec7354a8e09c30743438e65d5a37fb24fb78f2ef10c933f1ced550afa13384792358c0"

RPROVIDES:${PN} += "libSampleICC-devel \
pkgconfig-sampleicc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSampleICC2"

inherit rpm
