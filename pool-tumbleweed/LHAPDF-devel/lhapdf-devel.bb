SUMMARY = "Development files for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the header and source files for development with \
LHAPDF."
LICENSE = "GPL-3.0-only"

PV = "6.5.5"

RPM_NAME = "LHAPDF-devel-6.5.5-1.9.aarch64.rpm"
RPM_HASH = "a5d88e7208fe7a5886af0a5a4c95f374d1e14f87aa3c1ac59c3b6e9802344679efde6d048efe78dafe274991a45205a60b72479f0832f0a00651ac0da2f5ac7f"

RPROVIDES:${PN} += "LHAPDF-devel \
pkgconfig-lhapdf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3 \
libLHAPDF-6-5-5"

inherit rpm
