SUMMARY = "Keyless Git signing using Sigstore"
DESCRIPTION = "Keyless Git signing with Sigstore! \
 \
This is heavily inspired by https://github.com/github/smimesign, but uses \
keyless Sigstore to sign Git commits with your own GitHub / OIDC identity."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "gitsign-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "bc86ac6bb4879ede6ab85cbc2e1705e55dd98c9d8461e7cfe4df14d88db50c09e0a52b309e585827e1861b72515ac3ffad369a04cfb281e5f5b5dfc36c7c3b8a"

RPROVIDES:${PN} += "gitsign"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
