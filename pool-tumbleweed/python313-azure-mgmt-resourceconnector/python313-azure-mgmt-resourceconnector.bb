SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-resourceconnector-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "994fe66d611249a0fa4eb818651bc26102a9a29301f7f5a5f8db25303c131741ea62de32c8cdb14a10f7c6a4d2f33675975512505eb8309071b2647d61dbdd04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourceconnector \
python3.13dist-azure-mgmt-resourceconnector \
python313-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
