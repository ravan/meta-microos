SUMMARY = "GNUnet library libnss_gns4"
DESCRIPTION = "This package contains the libnss_gns4 library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libnss_gns4-2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "711325cb3c95974dce440a81939139facdf73a425f7fe65a636c63d768b162a18e76dd6c11960c9f07e3c012f00af33e84d204dccc7dcb7b439cdab0398ced7a"

RPROVIDES:${PN} += "libnss-gns4-2 \
libnss-gns4.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
