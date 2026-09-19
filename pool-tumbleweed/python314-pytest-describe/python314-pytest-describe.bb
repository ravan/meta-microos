SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-pytest-describe-2.2.0-2.5.noarch.rpm"
RPM_HASH = "223a41dccce400843c8d34f812c9089cf3fac8de1bf5ab6b11698bf57bbba679efb25741813ae1052953799eaee295cd9dc2aa14e30ecb2d3cadcb87b65164b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-describe \
python314-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
