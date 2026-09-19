SUMMARY = "Server part of MariaDB"
DESCRIPTION = "MariaDB is an open-source, multi-threaded, relational database management \
system. It's a backward compatible, drop-in replacement branch of the \
MySQL Community Server. \
 \
This package only contains the server-side programs."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "f617939cb48fae93f171b5f756a74df22f1f978e82331f1c5daea4113432ccee4eac26bae060c1973db41266eb56c773b9e3795b003c9bccc793c633f57d64cf"

RPROVIDES:${PN} += "config-mariadb \
libdaemon-example.so \
mariadb \
mariadb-debug \
mariadb-debug-version \
mariadb-server \
mysql \
mysql-debug \
mysql-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/perl \
/usr/bin/sh \
group-mysql \
ld-linux-aarch64.so.1 \
libJudy.so.1 \
libaio.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libodbc.so.2 \
libpam.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libwrap.so.0 \
libxml2.so.16 \
libz.so.1 \
mariadb-client \
mariadb-errormessages \
perl-base \
permissions \
python3-mysqlclient \
user-mysql"

inherit rpm
