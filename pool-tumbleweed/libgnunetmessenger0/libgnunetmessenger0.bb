SUMMARY = "GNUnet library libgnunetmessenger"
DESCRIPTION = "This package contains the libgnunetmessenger library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetmessenger0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "cf6d15881e031c3430afffcba46d3c835009545a65c1610f2db355877e8328aaf29e42d41772d7927b9f2a17ff5024fa2f35e8e0b8518ee6ead2742f95476619"

RPROVIDES:${PN} += "libgnunetmessenger.so.0 \
libgnunetmessenger0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetcadet.so.7 \
libgnunetidentity.so.1 \
libgnunetnamestore.so.0 \
libgnunetutil.so.20"

inherit rpm
