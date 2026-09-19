SUMMARY = "GNUnet library libgnunetconsensus"
DESCRIPTION = "This package contains the libgnunetconsensus library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetconsensus0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "978becb528b619c0971d7cb28de3958574349634d752c12d77261362d59c918cd12b6a6de0361fca5e5fccd56c22c32c4a61f245f110e6b7bd4ca74b3044f224"

RPROVIDES:${PN} += "libgnunetconsensus.so.0 \
libgnunetconsensus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
