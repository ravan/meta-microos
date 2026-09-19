SUMMARY = "Qt6 API bindings/wrapper for GPGME"
DESCRIPTION = "QGpgme provides a very high level Qt API around GpgMEpp. \
 \
This package contains the shared library built for Qt6."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libqgpgmeqt6-15-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "54c92cf56a5f02c3d7f96f1ec471fd2110437bcfab1c57554856f8b9cfa0d86753074d89e5afb92aa60668c7468f660e37b933482bdb8141eb8072e07cfee504"

RPROVIDES:${PN} += "libqgpgmeqt6-15 \
libqgpgmeqt6.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libstdc++.so.6"

inherit rpm
