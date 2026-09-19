SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python313-purl-1.6-3.5.noarch.rpm"
RPM_HASH = "aa4e89a6014e99e744172ba260998a65ddd042506f41c5ced3cfa82cde8648ceb38be5539dcb94eecd93c89e2e8d96b4536da80556c40c2c6e3529755a60249c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-purl \
python3.13dist-purl \
python313-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
