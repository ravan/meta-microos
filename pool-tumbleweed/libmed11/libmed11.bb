SUMMARY = "A library to store and exchange meshed data"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "libmed11-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "9358fd1fe2e1a1e8db4a994ca6733c8b9aeb7a181399e098f1e38f18efcbdb3e26e99292345866fbeb5a6ae9e2eaf87f8b478a3ef5fffc31b74756d07b125916"

RPROVIDES:${PN} += "libmed.so.11 \
libmed11"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
