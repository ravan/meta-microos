SUMMARY = "The actual libppd 2.x version library"
DESCRIPTION = "This package provides the libppd 2.x version library."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libppd2-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "d9f5532a970cfa751663f037477509deb00fdcddc80a06aae21a6674d99cfc3a7ad5d25d28a909bd37192c40af5cb0270293dc82cf45d484be8ff5c603e7c1a7"

RPROVIDES:${PN} += "libppd.so.2 \
libppd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libcupsfilters.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
