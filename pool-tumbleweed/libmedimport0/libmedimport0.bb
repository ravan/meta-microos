SUMMARY = "MED import Library"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmedimport0-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "a76d34c7f49f26a3da9c0abefb03881f544bc2d8976503c6f3bb24b92ba65ab8e4f91f27276e02f0692fdd22f25256e13090cb900b6b5aae0708f83617a1181c"

RPROVIDES:${PN} += "libmedimport.so.0 \
libmedimport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libmedC.so.11"

inherit rpm
