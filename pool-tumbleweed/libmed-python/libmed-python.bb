SUMMARY = "Python wrapper for the MED library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data. \
 \
This package contains the python bindings"
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmed-python-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "46ccabf6cb481715d483d4dbea21f0a34aad5527b73cd590a57009be72d51a8e74fa243ff1e91d890e035ede67f4e88b11adeb015c3915dbd234fafcfcb148c9"

RPROVIDES:${PN} += "libmed-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmedC.so.11 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
