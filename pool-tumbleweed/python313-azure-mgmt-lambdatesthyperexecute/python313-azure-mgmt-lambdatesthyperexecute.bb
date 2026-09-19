SUMMARY = "Microsoft Azure Lambdatesthyperexecute Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Lambdatesthyperexecute Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-lambdatesthyperexecute-1.0.0-1.5.noarch.rpm"
RPM_HASH = "5c7d012b9909057cf366be336340b6379b101b54fe5c97ce9497e55b07aca74dbb146713fe46d12c84853ff2434adc897183c5dece4058c668cb37ba491e42dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-lambdatesthyperexecute \
python3.13dist-azure-mgmt-lambdatesthyperexecute \
python313-azure-mgmt-lambdatesthyperexecute \
python3dist-azure-mgmt-lambdatesthyperexecute"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
