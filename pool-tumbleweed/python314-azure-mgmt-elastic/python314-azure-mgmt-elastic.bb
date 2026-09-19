SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-elastic-2.0.0-1.4.noarch.rpm"
RPM_HASH = "beb5d65f1f4a549e598c879a5e6ce2eede1ad272c59f6166fbf6dbc8e1412be90aa7ddb33a8289b1c419fe44ae20c600fd9dbbd7b4ca05ea4be179b3db4533ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-elastic \
python314-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
