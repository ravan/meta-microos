SUMMARY = "Development files for the Mifare card manipulation library"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains the libfreefare development files."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-devel-0.4.0-5.8.aarch64.rpm"
RPM_HASH = "5a77c41593d73bcf734bfef4a66fc9684348cc54ee2e16e377d528746688b54e3f66e2cd522c2e0aa9bd363c88311fb58e2875d1a6b0037ce1560793394c774f"

RPROVIDES:${PN} += "libfreefare-devel \
pkgconfig-libfreefare"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreefare0 \
pkgconfig-libnfc"

inherit rpm
