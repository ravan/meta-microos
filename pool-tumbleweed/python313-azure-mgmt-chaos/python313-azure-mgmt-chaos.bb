SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-chaos-2.0.0-1.5.noarch.rpm"
RPM_HASH = "1094a37992004a627661de3311bd633f14af96b96ca000737aec133f66aa6e26d2996b6f20af56ad527a6d9dc9917c3dd96fde4b47b41113a159a1325ded587e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-chaos \
python3.13dist-azure-mgmt-chaos \
python313-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
