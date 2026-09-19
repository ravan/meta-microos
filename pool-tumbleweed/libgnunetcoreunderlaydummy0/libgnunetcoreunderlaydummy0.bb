SUMMARY = "GNUnet library libgnunetcoreunderlaydummy"
DESCRIPTION = "This package contains the libgnunetcoreunderlaydummy library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetcoreunderlaydummy0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "e9c4df93c42107346e90c481b83090ed4301ce9ac326de6e21eada50e3cab599ebc3b474b174fdad6beeb4f97c93a8ed30277b1ffde653ba3a379ea3b146fa3c"

RPROVIDES:${PN} += "libgnunetcoreunderlaydummy.so.0 \
libgnunetcoreunderlaydummy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
