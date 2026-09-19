SUMMARY = "Microsoft Azure Impactreporting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Impactreporting Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-impactreporting-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "0d0b30427928ee4f8114f1bc51a948c21e9778c9ccfca719b4cf71b8b3ded1b0f0229bb0c06f890a8ce445d41a16b6a43beacac939fd35a6e6d10090f4734b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-impactreporting \
python3.13dist-azure-mgmt-impactreporting \
python313-azure-mgmt-impactreporting \
python3dist-azure-mgmt-impactreporting"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
