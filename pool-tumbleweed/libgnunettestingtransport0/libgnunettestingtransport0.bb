SUMMARY = "GNUnet library libgnunettestingtransport"
DESCRIPTION = "This package contains the libgnunettestingtransport library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettestingtransport0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "93701e471d2988305478a3a0156594b7fcb4f14cb53139a7916877237a6e7a4c6e42afaf735a64c34633e4cea776f4860321c13f883b226c2d2cc80e41872a79"

RPROVIDES:${PN} += "libgnunettestingtransport.so.0 \
libgnunettestingtransport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunethello.so.0 \
libgnunetutil.so.20"

inherit rpm
