SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-agate-stats-0.4.3-1.4.noarch.rpm"
RPM_HASH = "1c971ae54e40b3178c967f30e07083f7a67ad2eea1768fb2a6fb9dfb1a5b979ea4608a8b127c2255340013082c8158578639d002832ac85f6c59a6315f635315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-stats \
python314-agate-stats \
python3dist-agate-stats"

RDEPENDS:${PN} += "python-abi \
python314-agate \
python314-six"

inherit rpm
