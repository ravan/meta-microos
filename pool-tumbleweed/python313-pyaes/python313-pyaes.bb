SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python313-pyaes-1.6.1-4.10.noarch.rpm"
RPM_HASH = "72019b0329365fd46e755d0e7fae8ac6599f18c6013c6548fbc79308a8472456cf16c0561b7c6fcb5d598f7eada52bfba02657b95c72ebd83836ced4db9d4a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaes \
python3.13dist-pyaes \
python313-pyaes \
python3dist-pyaes"

RDEPENDS:${PN} += "python-abi \
python313-pycryptodome"

inherit rpm
