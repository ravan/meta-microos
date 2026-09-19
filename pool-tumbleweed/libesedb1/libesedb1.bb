SUMMARY = "Library to access the EDB format"
DESCRIPTION = "Library to access the Extensible Storage Engine (ESE) Database File (EDB) \
format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20260704"

RPM_NAME = "libesedb1-20260704-1.2.aarch64.rpm"
RPM_HASH = "b34ffc0d3fc4a98c227376b06fe7f6b4868ab34aceee4547a398aa15f0e0832dac140d41795c32662417a4c98ab6a432a0b7c1344c3317e5cf18cff02e8060d9"

RPROVIDES:${PN} += "libesedb.so.1 \
libesedb1"

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
