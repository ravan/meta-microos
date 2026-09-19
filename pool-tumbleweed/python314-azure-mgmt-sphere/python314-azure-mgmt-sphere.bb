SUMMARY = "Microsoft Azure Sphere Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sphere Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-sphere-1.0.0-1.9.noarch.rpm"
RPM_HASH = "0713f9ab85b67649a330d8e8f5ef541ee305384a00e245cf064031af810f49bf8a7a4aaa5aff38ff8e1480503af8500c3822abdc65528c098665ba3d492180e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-sphere \
python314-azure-mgmt-sphere \
python3dist-azure-mgmt-sphere"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
