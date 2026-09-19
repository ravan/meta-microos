SUMMARY = "Microsoft Azure Kubernetesconfiguration-extensiontypes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-extensiontypes Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-kubernetesconfiguration-extensiontypes-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "8cf5fe8f5690b5c1e64e5628deff3193e279a17f3abac952281a7a3dcddc08052a4177fec48d4eaed5ae7329553345321d8c3d4df197d3cc4578b2e62e7d6203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration-extensiontypes \
python3.13dist-azure-mgmt-kubernetesconfiguration-extensiontypes \
python313-azure-mgmt-kubernetesconfiguration-extensiontypes \
python3dist-azure-mgmt-kubernetesconfiguration-extensiontypes"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-kubernetesconfiguration \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
