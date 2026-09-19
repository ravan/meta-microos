SUMMARY = "MariaDB back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_mysql4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "4669e6b409639e6b240ac413b2965200db92aba83983edbad7dffd05471da736f31b511019bb49dcb5adf194afa7fe9e31c66ab4dc76bbbfdd9852255cbb4770"

RPROVIDES:${PN} += "libsoci-mysql.so.4.0 \
libsoci-mysql4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
