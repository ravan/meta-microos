SUMMARY = "Libraries needed to run iODBC"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI andx \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers. \
 \
This package provides the shared libraries needed by iODBC."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "libiodbc2-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "d7ea7b11cf8feb89675c610355682cf27a1abc24ce125d3da65faef3bd9506dc7c37a543728fed7756c347e751debbbb4e999ba260c3c8b3eed95eb8b8a10985"

RPROVIDES:${PN} += "libiodbc.so.2 \
libiodbc2 \
libiodbcinst.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
