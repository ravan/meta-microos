SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-storagepool-1.0.0-3.9.noarch.rpm"
RPM_HASH = "e554c824080abd6994dbaf0e21ef3640288f8cd09a9127e7069158be50f70f4e7b7a465c139f00dafd845c03e9708db00d2d9849636f3879518f7e726055ec89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storagepool \
python314-azure-mgmt-storagepool \
python3dist-azure-mgmt-storagepool"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
