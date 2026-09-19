SUMMARY = "Address translation library used primarily by libkdumpfile"
DESCRIPTION = "A library that provides an abstraction layer for translating addresses \
between address spaces (i.e. physical vs virtual). \
 \
This package contains the libaddrxlat library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.6"

RPM_NAME = "libaddrxlat3-0.5.6-3.5.aarch64.rpm"
RPM_HASH = "aecef6eb7ee8fb69c661c0fcd3055276b96d0329e1320dfb74fe28a0b7169bd51664533e16a149a96d66ff9a2537222ff950b3af24c977e9959ad545e222d045"

RPROVIDES:${PN} += "libaddrxlat.so.3 \
libaddrxlat3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
