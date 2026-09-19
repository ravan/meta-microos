SUMMARY = "A library for unified and interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities. \
 \
This package provides the shared library for LHAPDF."
LICENSE = "GPL-3.0-only"

PV = "6.5.5"

RPM_NAME = "libLHAPDF-6_5_5-6.5.5-1.9.aarch64.rpm"
RPM_HASH = "c6650988748d93369919db3c0e00b7954da7853ae11ed76af7afe3879b35f50668b3c82f8dfb60bdfbff73c764d2798617ad2a70475c06dd540dd783f830a33d"

RPROVIDES:${PN} += "libLHAPDF \
libLHAPDF-6-5-5 \
libLHAPDF-6.5.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
