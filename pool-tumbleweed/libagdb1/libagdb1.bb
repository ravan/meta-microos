SUMMARY = "Library to access the Windows SuperFetch database format"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb1-20210429-3.39.aarch64.rpm"
RPM_HASH = "d4c312f3531be8b7fd3e3749260e97109295d4b6950f335f51b5fdc7b84e7ca8615807d221e1058e1cd8c11914b267a4bd11e1604a0c44c04c7f45c8d22cb5e4"

RPROVIDES:${PN} += "libagdb.so.1 \
libagdb1"

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
libfwnt.so.1 \
libuna.so.1"

inherit rpm
