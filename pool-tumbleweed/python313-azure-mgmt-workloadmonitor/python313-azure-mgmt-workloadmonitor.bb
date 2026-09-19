SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python313-azure-mgmt-workloadmonitor-1.0.0~b4-2.9.noarch.rpm"
RPM_HASH = "1bc49ca35a1094d46de8cb1e5a9f3f3bb5e12ed5924e38ad138893c92e5262520a34f05e5987948edaac9051a61a007bae5ee6a807a85dbbb4d5538e6db6db63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloadmonitor \
python3.13dist-azure-mgmt-workloadmonitor \
python313-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
