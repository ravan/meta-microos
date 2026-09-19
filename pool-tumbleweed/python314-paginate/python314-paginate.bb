SUMMARY = "Divides large result sets into pages for easier browsing"
DESCRIPTION = "Divides large result sets into pages for easier browsing"
LICENSE = "MIT"

PV = "0.5.7"

RPM_NAME = "python314-paginate-0.5.7-1.9.noarch.rpm"
RPM_HASH = "191b5f39271d943856819dff17ac8c57697cea459f876aa78c64d4a7d7ac44a89a2a84dd0e70fb417a44f9613ec661f3261f2b2ebe9e089e3c513e54facba979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-paginate \
python314-paginate \
python3dist-paginate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
