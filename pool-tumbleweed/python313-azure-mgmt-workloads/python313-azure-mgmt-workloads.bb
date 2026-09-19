SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-workloads-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "eba46d6321b025f924bfc1a0e8828be10c1d0fc55fef4373a6212ac97cf2292e24c093a1b9574aa4cd96ebdb536c8ba3908efb6dbc9204a7381fed2019150cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloads \
python3.13dist-azure-mgmt-workloads \
python313-azure-mgmt-workloads \
python3dist-azure-mgmt-workloads"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
