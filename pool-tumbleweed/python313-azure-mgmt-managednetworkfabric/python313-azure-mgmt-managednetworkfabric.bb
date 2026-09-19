SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-managednetworkfabric-2.0.0-1.2.noarch.rpm"
RPM_HASH = "f4df5664fa503f032b6d99d4dd57e5119d7c370bd5d3f0189de4485dcc658e4951bfd5dbfdf4c10c94419f6d5965c1ca09411683c7108c4baae13f9ff1f05268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managednetworkfabric \
python3.13dist-azure-mgmt-managednetworkfabric \
python313-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
