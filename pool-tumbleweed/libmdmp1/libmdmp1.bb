SUMMARY = "Library for accessing the Windows Minidump (MDMP) format"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp1-20210420-3.29.aarch64.rpm"
RPM_HASH = "5aeac5fcd43e3141836708e72a2df1a5494a1dab5c604dbed5ee95586885d20999985c9123c76cfd069568d65b91e79b579cad88c17373d5557a98ac2c497bab"

RPROVIDES:${PN} += "libmdmp.so.1 \
libmdmp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdata.so.1"

inherit rpm
