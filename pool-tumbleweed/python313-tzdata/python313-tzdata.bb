SUMMARY = "Provider of IANA time zone data"
DESCRIPTION = "Provider of IANA time zone data"
LICENSE = "Apache-2.0"

PV = "2026.2"

RPM_NAME = "python313-tzdata-2026.2-1.2.noarch.rpm"
RPM_HASH = "c55710968ba0c1ce73065900faba8a4197c576c7b1617099dfeeb0d8bb82c6b7519812666256d99cb1f34db1f9375d5e92b1a2b1c5f9e8164f517dc497fce57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tzdata \
python3.13dist-tzdata \
python313-tzdata \
python3dist-tzdata"

RDEPENDS:${PN} += "python-abi"

inherit rpm
