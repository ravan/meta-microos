SUMMARY = "Library to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libolecf1-20260526-1.12.aarch64.rpm"
RPM_HASH = "803fcfc662aef00bea6cdbaf5f64186a83b413a2e9af4e7aa01664065a14470d41a4d6aba3e64aa469a6bb22017b3e4efb6f18d58346ebd5b01314d409643719"

RPROVIDES:${PN} += "libolecf.so.1 \
libolecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
