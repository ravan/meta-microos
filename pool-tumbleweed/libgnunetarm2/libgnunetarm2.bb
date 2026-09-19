SUMMARY = "GNUnet library libgnunetarm"
DESCRIPTION = "This package contains the libgnunetarm library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetarm2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "cba32ed3e88e6c739116964d1e18e8e8dfc5401e384e38bf489465833fa8af2f22fb6e7c3186ccc0c64199ae5e71a921cdf916bfc1ac1eff74b5935669e13d3b"

RPROVIDES:${PN} += "libgnunetarm.so.2 \
libgnunetarm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
