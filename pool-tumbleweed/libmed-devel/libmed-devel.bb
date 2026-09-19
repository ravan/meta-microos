SUMMARY = "Libmed development files"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmed-devel-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "7eca84d270ed349b38c48444588292e155d46db444250696a7c9ef32c2c4876e0067a102dc52920011d15adfdf719180121acb02890cb93f4fb99da075666fca"

RPROVIDES:${PN} += "cmake-MEDFile \
libmed-devel"

RDEPENDS:${PN} += "hdf5-devel \
libmed11 \
libmedC11 \
libmedimport0"

inherit rpm
