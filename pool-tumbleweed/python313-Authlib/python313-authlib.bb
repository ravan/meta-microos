SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "python313-Authlib-1.7.2-4.1.noarch.rpm"
RPM_HASH = "ef7eb6b925dfdb29b2f02b98aa7cd2fa6916f5b8821637b301694761aeab83c83ae62dd6ff594946a5401fe19d4027d5eb83dc1fe0301835baaa4b7bb4d27855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Authlib \
python3-authlib \
python3.13dist-authlib \
python313-Authlib \
python313-authlib \
python3dist-authlib"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-joserfc"

inherit rpm
