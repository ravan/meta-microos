SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python313-spake2-0.9-1.9.noarch.rpm"
RPM_HASH = "d39046f4147f8f0bcc4ef972b3d656c1421ec3f8ab85eb9b43519b0aa9bba97adb6fbdb9e5ac429a6fbdfe6ff48f7510e61c49f38e829a5b8926cbd6dc67ca0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spake2 \
python3.13dist-spake2 \
python313-spake2 \
python3dist-spake2"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-hkdf"

inherit rpm
