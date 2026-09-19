SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "The libfvde library is a library to access the File Vault Drive Encryption format"
LICENSE = "LGPL-3.0-or-later"

PV = "20240502"

RPM_NAME = "libfvde1-20240502-2.20.aarch64.rpm"
RPM_HASH = "f08120a14e21d636cdf16f83a3971ba31e116d9c5230efa7bbd24f10725c0457dcab966987d58a6601dc3cb81e471ebd5a0830ab7599a249d536a6dd6afd485f"

RPROVIDES:${PN} += "libfvde.so.1 \
libfvde1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfplist.so.1 \
libhmac.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
