SUMMARY = "Development files for FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This package contains the header file needed to develop applications that \
use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.16.0"

RPM_NAME = "libfido2-devel-1.16.0-2.1.aarch64.rpm"
RPM_HASH = "c8994a18812cfa8526eae20aaa346c574d3502c0f2b0de327cc8527a2edc4e68de9f35ab2333550f8fe02264e342cc4cb3f92df8a3f4a28cc1e7fea3b79d3b05"

RPROVIDES:${PN} += "libfido2-devel \
pkgconfig-libfido2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfido2-1 \
openssl-devel \
pkgconfig-libcrypto"

inherit rpm
