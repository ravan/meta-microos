SUMMARY = "X.509 certificates validation"
DESCRIPTION = "A Python library for validating X.509 certificates or paths. Supports various \
options, including: validation at a specific moment in time, whitelisting and \
revocation checks."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "python313-certvalidator-0.11.1-1.9.noarch.rpm"
RPM_HASH = "f7b1bb3484f36e8ed5d24ee3b73af16018882f8c3e62fdae82e0036a74edb3c7e60c7b31bc7b6bd4a5f1353f15a69c3a3e26d65261ebbb3c8d9b71aabf8d96e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certvalidator \
python3.13dist-certvalidator \
python313-certvalidator \
python3dist-certvalidator"

RDEPENDS:${PN} += "python-abi \
python313-asn1crypto \
python313-oscrypto"

inherit rpm
