SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python314-hvac-2.4.0-1.4.noarch.rpm"
RPM_HASH = "74bc24fffb4c1dcc0fb9f90d2c5967f4f773764afe6952b179119ca43f10178f601b4a881999aa4efc64f1e7e4aa0d467a87bd970385be833ff0e6ac79e45818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hvac \
python314-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
