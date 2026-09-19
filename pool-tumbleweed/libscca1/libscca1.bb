SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libscca1-20260527-1.11.aarch64.rpm"
RPM_HASH = "ce2988d002ecdfd75b42f6e2ebfbd3e2d169673ff50091f6ef299b89287c18222caf5cee6fe709b3cf5191601974bf14626710434a55b71ed4584c32ad8e0ed2"

RPROVIDES:${PN} += "libscca.so.1 \
libscca1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
