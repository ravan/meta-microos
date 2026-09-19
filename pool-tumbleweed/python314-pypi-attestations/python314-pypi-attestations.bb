SUMMARY = "A library to convert between Sigstore Bundles and PEP-740 Attestation objects"
DESCRIPTION = "A library to convert between Sigstore Bundles and PEP-740 Attestation objects"
LICENSE = "Apache-2.0"

PV = "0.0.29"

RPM_NAME = "python314-pypi-attestations-0.0.29-2.2.noarch.rpm"
RPM_HASH = "6ac253106ac6f0477051c1d928ff6f48e616e87df4e40da9bb67b5941b5dd2df377d2ea168c919be510165c32d180ced479fc868ea318a75fda825e8ffacb43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypi-attestations \
python314-pypi-attestations \
python3dist-pypi-attestations"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography \
python314-packaging \
python314-pyasn1 \
python314-pydantic \
python314-requests \
python314-rfc3986 \
python314-sigstore \
python314-sigstore-models"

inherit rpm
