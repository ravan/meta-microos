SUMMARY = "MariaDB tools"
DESCRIPTION = "A set of scripts for administering a MariaDB or developing \
applications with MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-tools-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "e9a48788b227372e901f19e17f41506e32d2b4bdac5fd89822a4d7c06b60175e3f26f0c12888b051a485acbf6ea7c9e77a32a29477351149dc2be38587ef744c"

RPROVIDES:${PN} += "mariadb-tools \
mysql-/usr/bin/mysqlhotcopy \
mysql-client-/usr/bin/perror \
mysql-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
perl-DBD-mysql"

inherit rpm
