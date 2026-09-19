SUMMARY = "Library to provide basic file input/output abstraction"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access."
LICENSE = "LGPL-3.0-or-later"

PV = "20260623"

RPM_NAME = "libbfio1-20260623-1.4.aarch64.rpm"
RPM_HASH = "6a5195548da815d01c5b5e87218777e522f41276fe0b779069dada1c3bd802df848be16b3753a834ce21d9d7c464e5a5966fb3ac0478c30482280936f4d4df1e"

RPROVIDES:${PN} += "libbfio.so.1 \
libbfio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcpath.so.1 \
libcthreads.so.1 \
libuna.so.1"

inherit rpm
