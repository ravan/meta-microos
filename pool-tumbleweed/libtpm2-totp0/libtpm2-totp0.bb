SUMMARY = "TOTP library for TPM 2.0 chips"
DESCRIPTION = "This package provides the tpm2-totp library."
LICENSE = "BSD-3-Clause"

PV = "20240326.33e1986"

RPM_NAME = "libtpm2-totp0-20240326.33e1986-2.5.aarch64.rpm"
RPM_HASH = "933ae55ee6c3bf5b53ba760d9ea0708de4cbb3d2d98f0c22b2f564717ecec277059b9ef6bf269eb62cc561d90f6fd4424aad845ed083a0d7f6a5fd8317e759d2"

RPROVIDES:${PN} += "libtpm2-totp.so.0 \
libtpm2-totp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-esys.so.0 \
libtss2-mu.so.0"

inherit rpm
