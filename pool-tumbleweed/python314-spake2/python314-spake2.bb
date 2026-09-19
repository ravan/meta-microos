SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python314-spake2-0.9-1.9.noarch.rpm"
RPM_HASH = "879b6c3ca416a6e16b8fb6ffad26ebca5ddbc5ed2cb0a965bedc27d060a099008ea55bb2fc25186e98439c7e9896a9d0e970c445fe82a40c870f633cbd5c5cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spake2 \
python314-spake2 \
python3dist-spake2"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-hkdf"

inherit rpm
