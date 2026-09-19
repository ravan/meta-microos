SUMMARY = "Development files for the libbd_crypto plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_crypto plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_crypto-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "5a31b28bfc64e5609a31e9726c864ffdb2622b11f91a7a770bd08e145283564b89ebf59503b8d342933385c10fb51b02b3c1bb4f0b5b12d013c31f76b7c3b346"

RPROVIDES:${PN} += "libbd-crypto-devel \
libblockdev-crypto-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-crypto3"

inherit rpm
