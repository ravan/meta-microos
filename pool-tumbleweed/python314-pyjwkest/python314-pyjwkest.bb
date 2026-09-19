SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.4"

RPM_NAME = "python314-pyjwkest-1.4.4-1.2.noarch.rpm"
RPM_HASH = "e892e569d49d9517ef325d50642381bbfaf1824dc559a1873606eb2bcbe1f49c22169da907ff02c00dc865cf452bd87f1cb7f6fc14a3174e45b5dae70568ba5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyjwkest \
python314-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-pycryptodomex \
python314-requests \
python314-six \
update-alternatives"

inherit rpm
