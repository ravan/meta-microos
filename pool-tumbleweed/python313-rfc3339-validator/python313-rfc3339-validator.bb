SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python313-rfc3339-validator-0.1.4-4.5.noarch.rpm"
RPM_HASH = "f06c0bd7bdc91de2ed845365db486408b7268f41bdfec08ae4b478c82ab0fe26caa02aa488445ed03e7158b9fc9a938cf0493ba284acb5b7dae6fa7ca37195e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3339-validator \
python3.13dist-rfc3339-validator \
python313-rfc3339-validator \
python3dist-rfc3339-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
