SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-customproviders-1.0.1-1.2.noarch.rpm"
RPM_HASH = "9204a2c53345890d72e1ecf181b08120ce20475970583fac1be4eb5717d05fc5913df3cdc30a75097eec5d4ac37ad87b8f1494a522ac33dc3ae13f3e906e732e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-customproviders \
python314-azure-mgmt-customproviders \
python3dist-azure-mgmt-customproviders"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
