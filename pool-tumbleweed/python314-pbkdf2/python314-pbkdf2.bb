SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python314-pbkdf2-1.3-4.5.noarch.rpm"
RPM_HASH = "5dc0564371512e425bc202474ce07660dbe89e10c764b102ee411a51120101206f5cfee0ee0436ceb177178b32ed2e32485184955cc7a72f370b2efedfae42f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pbkdf2 \
python314-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python314-pycrypto"

inherit rpm
