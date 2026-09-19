SUMMARY = "FreeTDS ODBC Driver for unixODBC"
DESCRIPTION = "The ODBC drivers is the FreeTDS's project most recent addition. Its \
chief advantage is that it makes FreeTDS servers look like other ODBC \
servers, a big help to people who know ODBC and/or write applications \
for several kinds of servers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "libtdsodbc0-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "9f1ec99c4e15ae33120e7ca63b8f4b6e66ea0627a40c28b543d13fe102bae8863f882378e26e665a513ba5b50feb3f8a07f6f17ad5c45c5923a0717a8cd2bdd9"

RPROVIDES:${PN} += "libtdsodbc.so.0 \
libtdsodbc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8 \
libodbcinst.so.2 \
unixODBC"

inherit rpm
