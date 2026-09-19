SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "med-tools-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "3862422c2c8a45371f92655196c9a1c95525d2e97a6f51bbde8e86ccacf8aeda4e41165cf5e91c91dfd5a33ae995f943d445e353685e856eced01bb16370c32b"

RPROVIDES:${PN} += "med-tools"

RDEPENDS:${PN} += "/usr/bin/wish \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmedC.so.11 \
libmedimport.so.0 \
libstdc++.so.6"

inherit rpm
