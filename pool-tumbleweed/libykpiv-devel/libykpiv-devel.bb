SUMMARY = "Development files for the Yubikey NEO PIV applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PIV applet library."
LICENSE = "BSD-2-Clause"

PV = "2.7.3"

RPM_NAME = "libykpiv-devel-2.7.3-1.3.aarch64.rpm"
RPM_HASH = "7d8b27b8d93804b6f74b3d6beba962cf96a66485d9cbc1b4794d2a059a5e9434453ba021706f80eda181c74d389c1e88674041339bb86c8dfe47f365b67e3c2f"

RPROVIDES:${PN} += "libykpiv-devel \
pkgconfig-ykpiv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykpiv2 \
pkgconfig-libcrypto"

inherit rpm
