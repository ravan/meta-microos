SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python314-pyaes-1.6.1-4.10.noarch.rpm"
RPM_HASH = "1bc9517ddd887edb292a55ed2dc89e31e08908cb6322f07ace5b28533955dba9139c02c99a80a2ec10c80908c874f11fd768a5e2efc7f1d9858b022e9a980dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyaes \
python314-pyaes \
python3dist-pyaes"

RDEPENDS:${PN} += "python-abi \
python314-pycryptodome"

inherit rpm
