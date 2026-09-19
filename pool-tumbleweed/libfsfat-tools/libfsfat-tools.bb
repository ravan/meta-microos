SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfsfat-tools-20260826-1.1.aarch64.rpm"
RPM_HASH = "d9d40083a4f081f643bc2daee6d3750ac86e0ace8de3f2479ca8a5ee8286212ebb0bd77cc618231527fd615acb148cfc44f1abd60f259dc0af9ee2993afc3f77"

RPROVIDES:${PN} += "libfsfat-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsfat.so.1 \
libfuse3.so.4 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
