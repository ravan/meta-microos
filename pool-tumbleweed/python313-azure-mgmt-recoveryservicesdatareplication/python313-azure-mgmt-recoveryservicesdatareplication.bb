SUMMARY = "MS Azure Recoveryservicesdatareplication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicesdatareplication Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-recoveryservicesdatareplication-1.0.0-1.4.noarch.rpm"
RPM_HASH = "65ce4204b28fe090ddaf830809ffbe6c3c86e2ae957818ca1dcede9a34175b03844f0b78a950181e989ebbd0fde634e05cbd311a456107641d4547a0ff1f18db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicesdatareplication \
python3.13dist-azure-mgmt-recoveryservicesdatareplication \
python313-azure-mgmt-recoveryservicesdatareplication \
python3dist-azure-mgmt-recoveryservicesdatareplication"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
