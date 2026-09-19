SUMMARY = "Microsoft Azure Portalservicescopilot Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portalservicescopilot Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-portalservicescopilot-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "39fe4108b1b986c4e6753b4e27381c61151a92045bcce21af23473944175bc0e54d9ba3310e346a1619f950a11968a8fb17343fc0b8a7e3d07aa110bf1c3ef90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-portalservicescopilot \
python3.13dist-azure-mgmt-portalservicescopilot \
python313-azure-mgmt-portalservicescopilot \
python3dist-azure-mgmt-portalservicescopilot"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
