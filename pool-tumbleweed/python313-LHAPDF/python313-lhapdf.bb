SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.5"

RPM_NAME = "python313-LHAPDF-6.5.5-1.9.aarch64.rpm"
RPM_HASH = "12615565e9f67aa6b7c38a00d8f16f2f12117b60111102fa8749aa645580aa984cc658396ed7e7fe71ef3f3499d47bc01cdaade1187d3c0fb3f42492ef3fbf47"

RPROVIDES:${PN} += "python3-LHAPDF \
python313-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.5.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
