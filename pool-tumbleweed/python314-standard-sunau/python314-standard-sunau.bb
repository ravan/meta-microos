SUMMARY = "Standard library sunau redistribution. 'dead battery'"
DESCRIPTION = "Standard library sunau redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python314-standard-sunau-3.13.0-2.4.noarch.rpm"
RPM_HASH = "01fd2418b91717a6cc41a53a86f674318edd763aa319c5546aaf5f81c38e38546052758d111a96c7f8f20215aa0fff8dcc7f4162f0edef928d10f0da98524a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standard-sunau \
python314-standard-sunau \
python3dist-standard-sunau"

RDEPENDS:${PN} += "python-abi \
python314-audioop-lts"

inherit rpm
