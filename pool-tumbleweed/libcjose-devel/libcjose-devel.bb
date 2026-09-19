SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.2.8"

RPM_NAME = "libcjose-devel-0.6.2.8-2.1.aarch64.rpm"
RPM_HASH = "51ac8d6360e5e169f2e152d5f018c6d254642aa9c493fd593c30db0a485a67731931da863c511c885d2c7000ba871439e2f129cfcd8fffd83218d477a9732c8c"

RPROVIDES:${PN} += "libcjose-devel \
pkgconfig-cjose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjose0 \
pkgconfig-jansson \
pkgconfig-libcrypto"

inherit rpm
