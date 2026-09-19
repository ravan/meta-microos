SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar (Disk Archive) is a hardware-independent backup solution. Dar uses \
catalogs (unlike tar),which it makes it possible to extract a single \
file without having to read the entire archive. It is also possible to \
create incremental backups. Dar archives can also be created or used \
with the libdar library (for example, with KDar, a KDE application). \
This package contains the command line tools and documentation."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.6"

RPM_NAME = "dar-2.8.6-1.1.aarch64.rpm"
RPM_HASH = "d81c03416ccfdf4e9613d61fbea3a0e5d5251741158fe564ab1671dacc637dce4957b36330ae96b3b2cdb3d9b029048fbbc603a9831ad7aae994247071be70b0"

RPROVIDES:${PN} += "config-dar \
dar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdar64.so.7000 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
