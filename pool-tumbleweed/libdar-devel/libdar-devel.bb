SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar stands for Disk ARchive and is a hardware independent backup \
solution. Dar uses catalogs (unlike tar), so it is possible to extract \
a single file without having to read the whole archive, and it is also \
possible to create incremental backups. \
 \
Dar archives can also be created, or used, via the libdar library (with \
KDar, a KDE application, for example). \
 \
This package contains the library used by Dar and KDar."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.6"

RPM_NAME = "libdar-devel-2.8.6-1.1.aarch64.rpm"
RPM_HASH = "370e0c2eb82f50d1eac5b0675a8596237f28bc5cedc718b7e6501789a829175e5b0c2062280a83378531476f737f4967746a7ab772d7e694a94d9454cd26ab4f"

RPROVIDES:${PN} += "libdar-devel \
pkgconfig-libdar64"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdar64-7000"

inherit rpm
