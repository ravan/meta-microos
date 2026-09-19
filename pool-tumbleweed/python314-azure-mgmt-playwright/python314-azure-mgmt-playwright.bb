SUMMARY = "Microsoft Azure Playwright Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Playwright Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-playwright-1.0.0-1.4.noarch.rpm"
RPM_HASH = "cedb9f5fe7dac40eb9f9032c7aaa69d446bb5d6d075e001af8332b041b70c8abc8d1020f49fd6d67de35f533393fced99f4ac358749fe2db7291149cdfc59c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-playwright \
python314-azure-mgmt-playwright \
python3dist-azure-mgmt-playwright"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
