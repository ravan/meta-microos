SUMMARY = "Constrained Column Approximate Minimum Degree"
DESCRIPTION = "CCOLAMD computes an column approximate minimum degree ordering \
algorithm, (like COLAMD), but it can also be given a set of ordering \
constraints. CCOLAMD is required by the CHOLMOD package. \
 \
CCOLAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libccolamd3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "97be106913951adbf90ff607e90a49d1cbe6be15a9567429e13be292166cc06de3cd87791202076dbcf14254fc4ba1e1aa9cc3e90526c29b2591626780cb32a0"

RPROVIDES:${PN} += "libccolamd.so.3 \
libccolamd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
