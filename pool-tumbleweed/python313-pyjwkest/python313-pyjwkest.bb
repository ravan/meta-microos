SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.4"

RPM_NAME = "python313-pyjwkest-1.4.4-1.2.noarch.rpm"
RPM_HASH = "4d65f871c94aaf993e40209956a800bb65227f6bb8ffb40a1621447070329754c73ae2fc8c4af344bace28857c9c6695d6f657c641d39695ef0c3e0b377fc20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjwkest \
python3.13dist-pyjwkest \
python313-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-pycryptodomex \
python313-requests \
python313-six \
update-alternatives"

inherit rpm
