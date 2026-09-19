SUMMARY = "Fortran API for the MED mesh data library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmedfwrap11-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "a66c4a808ffdfd7a3b57d4bc41a6e6169a21f852eb9e9bc3596dc558367419869baf2bda6520dc3e8ad26b896ef09ecbc7903eebfdcf37ddaec9e7f27a8b5ef3"

RPROVIDES:${PN} += "libmedfwrap.so.11 \
libmedfwrap11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmedC.so.11 \
libstdc++.so.6"

inherit rpm
