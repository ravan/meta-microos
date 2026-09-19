SUMMARY = "GDAL MySQL driver plugin"
DESCRIPTION = "OGR loadable driver plugin for the MySQL/MariaDB vector format."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-mysql-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "f1025d25309dcaa52241bac0537cbb9bc4071a71b3718be443922ae36d20292e40d8dc4231ae0c8cc63862f5e13f9bc49de44bafe2c8ffc511a37e073176b462"

RPROVIDES:${PN} += "gdal-mysql"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
