SUMMARY = "GNUnet library libgnunettesting"
DESCRIPTION = "This package contains the libgnunettesting library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettesting3-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "83ed623a505d03704e9946ecaa4f7283b9b041b25e7268563b07b21697e9a21993a11f5ad188fca9c17ecfe54fe18f2a127212cf773841dc6bd5158afa397edf"

RPROVIDES:${PN} += "libgnunettesting.so.3 \
libgnunettesting3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
