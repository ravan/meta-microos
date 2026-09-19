SUMMARY = "GNUnet library libgnunetnat"
DESCRIPTION = "This package contains the libgnunetnat library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnat2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "f1e61066fad7a75bb9c94c46a4ae74e781882bbd58b192eda82b06d69599394490df8e26f790847f20dd41064e69ce2ad2d6b21d03406f710d884d96fa720419"

RPROVIDES:${PN} += "libgnunetnat.so.2 \
libgnunetnat2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
