SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.5"

RPM_NAME = "python314-LHAPDF-6.5.5-1.9.aarch64.rpm"
RPM_HASH = "658bb1acbd05f174ad0426966f76c51c301a5abfab0411e5e1bc4dc56990745b245b6fb3cfeaa4fea5b3e5bd058bce97514bfc29e54edda3419a649bd25271ff"

RPROVIDES:${PN} += "python314-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.5.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.14.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
