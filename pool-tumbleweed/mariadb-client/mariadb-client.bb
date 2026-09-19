SUMMARY = "Client for MariaDB"
DESCRIPTION = "This package contains the standard clients for MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-client-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "ab0dc380c55ed0681483c7700f1ad33b3407b2d8c2e6ad0947666ae721d4b594c1244ac8ae3d6abc47b96e491ce071ddcf0667dafe84202a07c1250287aff1ba"

RPROVIDES:${PN} += "config-mariadb-client \
group-mysql \
mariadb-client \
mysql-client \
user-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libmariadb3 \
libncurses.so.6 \
libpcre2-posix.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
mariadb-errormessages \
sysuser-shadow"

inherit rpm
