SUMMARY = "A library to convert between Sigstore Bundles and PEP-740 Attestation objects"
DESCRIPTION = "A library to convert between Sigstore Bundles and PEP-740 Attestation objects"
LICENSE = "Apache-2.0"

PV = "0.0.29"

RPM_NAME = "python313-pypi-attestations-0.0.29-2.2.noarch.rpm"
RPM_HASH = "f9c6befd6378274d9a998d29436dd031a8fca5f6c1947f3768ec14fdeddcb5a697420284debfa38bee34baa8572f4e841cf441642d81b4fb049d35a323a20ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypi-attestations \
python3.13dist-pypi-attestations \
python313-pypi-attestations \
python3dist-pypi-attestations"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography \
python313-packaging \
python313-pyasn1 \
python313-pydantic \
python313-requests \
python313-rfc3986 \
python313-sigstore \
python313-sigstore-models"

inherit rpm
