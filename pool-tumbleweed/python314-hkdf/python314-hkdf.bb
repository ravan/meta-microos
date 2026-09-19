SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python314-hkdf-0.0.3-3.5.noarch.rpm"
RPM_HASH = "e9d0f6c46e87a8a9add42651d29a1d272d54013080c03bd03dd5245c8b3900b5b644a7046bffbcd7797e198a8281ae058a2a2533cadf555f2a5eabbe0a5b2486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hkdf \
python314-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
