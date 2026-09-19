SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-loadtesting-1.0.0-2.9.noarch.rpm"
RPM_HASH = "e06af8d7abd80c3287d3d0953dcac0a1ec32a554ca40e7ac4935a662f5223712c2d11612e169eae3d5ad5b2089f5b71ebc68657f3b4e13011ec10e74dc569a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-loadtesting \
python314-azure-mgmt-loadtesting \
python3dist-azure-mgmt-loadtesting"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
