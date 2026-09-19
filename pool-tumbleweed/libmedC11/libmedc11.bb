SUMMARY = "C++ API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmedC11-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "c469ca3d752559acaf3bde37979c2a7cc744d3832c5e5486968f4c57a49a1d4956851f70f546d49a599613c7f0736dbd0e5df3e6d8b0d62609ecbe0117758b59"

RPROVIDES:${PN} += "libmedC.so.11 \
libmedC11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libstdc++.so.6"

inherit rpm
