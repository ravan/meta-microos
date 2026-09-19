SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20260704"

RPM_NAME = "libesedb-tools-20260704-1.2.aarch64.rpm"
RPM_HASH = "e3b0d759c828d272042a658faa2913863449185536f253b7c5fe2cb4c7d0c683f94cb0920c66392620f31a418125382f95d954fa5bd12d9067589e2b8060f133"

RPROVIDES:${PN} += "libesedb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libesedb.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
