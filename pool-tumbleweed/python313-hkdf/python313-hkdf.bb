SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python313-hkdf-0.0.3-3.5.noarch.rpm"
RPM_HASH = "a8cd5cda485c9d30a1470d0e16555f82052030cc81f108dd264b724bdcf95cfc9e62620efd4d6f9336f1c1f8a46ad5e4808177c4df27a8c46fb7417667646bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hkdf \
python3.13dist-hkdf \
python313-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
