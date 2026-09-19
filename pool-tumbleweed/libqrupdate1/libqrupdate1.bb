SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "libqrupdate1-1.1.2-3.41.aarch64.rpm"
RPM_HASH = "87e28f4e44e40986a34a0c9bde44e0bf2d3c48cf3233733b7def80093d79abf0a8c915b5eef69cb92efc7dae75197d2db7b936cc27ed91beddc90e02d1f6cca7"

RPROVIDES:${PN} += "libqrupdate.so.1 \
libqrupdate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
