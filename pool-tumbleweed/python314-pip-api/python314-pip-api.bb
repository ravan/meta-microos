SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.34"

RPM_NAME = "python314-pip-api-0.0.34-3.4.noarch.rpm"
RPM_HASH = "03522268f97e7aa089decb67f17444cf4a198814ed28de9f929f3d53735eeeef62d1f859c2e121a72f8430bdd4972bf67bdb5f4eec3c1c3c0b7d3b2a886f9b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pip-api \
python314-pip-api \
python3dist-pip-api"

RDEPENDS:${PN} += "python-abi \
python314-pip \
python314-tomli"

inherit rpm
