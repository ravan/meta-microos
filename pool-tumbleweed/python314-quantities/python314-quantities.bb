SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.16.4"

RPM_NAME = "python314-quantities-0.16.4-1.5.noarch.rpm"
RPM_HASH = "409914db9f1776c086d11ba999a5c6d898967cb60e13b9d1466fbc0483cc66c4b22734d49ca8b29522a142dc430e7e89263c9a9b16cfd2bbbd8a751828fee736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-quantities \
python314-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
