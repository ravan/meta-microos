SUMMARY = "A library for date and time data types"
DESCRIPTION = "A library for date and time data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfdatetime1-20260521-1.6.aarch64.rpm"
RPM_HASH = "ce0563915bfe3a238ba032be66932603f4583dfd8225fe67186f03272ebc6d2bb13b1d851f045bdc295d2e0b4f17aadd87de7d9a03ddde05a3c32df5eaba8d4e"

RPROVIDES:${PN} += "libfdatetime.so.1 \
libfdatetime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
