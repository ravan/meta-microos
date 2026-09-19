SUMMARY = "Microsoft Azure Storagediscovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagediscovery Management Client Library. \
 \
This package has been tested with Python 3.9+"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-storagediscovery-1.0.1-1.3.noarch.rpm"
RPM_HASH = "ac6441c59c6d4c6372f79de9e5cd5df75093ab0383497b6835f0e3a11e104cbc1723dd215d7b8cdc793678740f91c3536e19cf0173f4523841350904737234e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagediscovery \
python3.13dist-azure-mgmt-storagediscovery \
python313-azure-mgmt-storagediscovery \
python3dist-azure-mgmt-storagediscovery"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
