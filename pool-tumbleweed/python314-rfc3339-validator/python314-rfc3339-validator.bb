SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python314-rfc3339-validator-0.1.4-4.5.noarch.rpm"
RPM_HASH = "75564cf33b93dac79974255b929318871d051520fa9e467cde83dc02d10f9260bd75895b17362fd91af13b92ff6ce9a2388e4cf1694f0bde5a26429cd9f8b0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rfc3339-validator \
python314-rfc3339-validator \
python3dist-rfc3339-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
