SUMMARY = "Microsoft Azure Devhub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devhub Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-devhub-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "73f6da6bbc8de223b1ff2740008af35c7ec7392de27af8889ea0c054acd3450bb6fb08df5f3f7654794db16e8b89ac192b3ab71c871a78c29075cffe714dc471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devhub \
python3.13dist-azure-mgmt-devhub \
python313-azure-mgmt-devhub \
python3dist-azure-mgmt-devhub"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
