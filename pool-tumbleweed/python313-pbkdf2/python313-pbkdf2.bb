SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python313-pbkdf2-1.3-4.5.noarch.rpm"
RPM_HASH = "5b5f2a33cb86048092785251e93207b6dc31d1a9deed856ac871316d55baed309f724efe02f2bec7181f4d17047ad6e538268d5aa0d31628448b72c1c2172c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbkdf2 \
python3.13dist-pbkdf2 \
python313-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python313-pycrypto"

inherit rpm
