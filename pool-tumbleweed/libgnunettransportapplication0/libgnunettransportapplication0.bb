SUMMARY = "GNUnet library libgnunettransportapplication"
DESCRIPTION = "This package contains the libgnunettransportapplication library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettransportapplication0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "a27bf48bd2b0f1454c73fa184ab607edcc873438590ae6b54ae20216bb3e0dae35bbc161d4deab337686a03f31870183ab475109bfc9a98cb074db115dae3cbf"

RPROVIDES:${PN} += "libgnunettransportapplication.so.0 \
libgnunettransportapplication0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
