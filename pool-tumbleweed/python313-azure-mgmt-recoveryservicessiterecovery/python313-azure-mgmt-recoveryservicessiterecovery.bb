SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-recoveryservicessiterecovery-2.0.0-1.1.noarch.rpm"
RPM_HASH = "d3cc85477dc68a23603d1ab42896fc0a63f49b3c00dcefff617f5cd0579990d8ae4dd0017a48aef1dc697b99c10ed94a369c81c1f3723b6732f1a3d70cdec7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicessiterecovery \
python3.13dist-azure-mgmt-recoveryservicessiterecovery \
python313-azure-mgmt-recoveryservicessiterecovery \
python3dist-azure-mgmt-recoveryservicessiterecovery"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
