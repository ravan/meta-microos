SUMMARY = "Development headers for the TOTP library for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the tpm2-totp lib."
LICENSE = "BSD-3-Clause"

PV = "20240326.33e1986"

RPM_NAME = "libtpm2-totp0-devel-20240326.33e1986-2.5.aarch64.rpm"
RPM_HASH = "433f9ba3eb38934ef06cb0a89cf5ad679f967baa5b2cceb91f322720502a00a23cde3f602c771a1d99e06c546a6c1a9b9c22793cc615156b06cbf5cfb0182798"

RPROVIDES:${PN} += "libtpm2-totp0-devel \
pkgconfig-tpm2-totp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-tss2-esys \
pkgconfig-tss2-mu \
tpm2-totp"

inherit rpm
