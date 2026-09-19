SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-crashtest-0.4.1-2.14.noarch.rpm"
RPM_HASH = "d9d316f3a7e9749e3cdb45515ebccc05cccfa72ce6dffd1457255cece03451d938a59c28c1a65fdacaf2e76851a27cb3c13e21c19e3dc020c9c157d434ddfa45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crashtest \
python314-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
