SUMMARY = "Microsoft Azure Durabletask Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Durabletask Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-durabletask-1.1.0-1.2.noarch.rpm"
RPM_HASH = "77bfcc652e3837c95dbba4957e1912c89060da8b509f8c9bbb4a68f681d2180c926b4691fb837e119e5eaa288d468e70b2455d021f6cfc63c757f002933bb99c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-durabletask \
python3.13dist-azure-mgmt-durabletask \
python313-azure-mgmt-durabletask \
python3dist-azure-mgmt-durabletask"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
