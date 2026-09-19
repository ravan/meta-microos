SUMMARY = "Microsoft Azure Containerservicesafeguards Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerservicesafeguards Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-containerservicesafeguards-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "977ade53878607a217f8138a93488e3d07e57bdb01ed7601df9ecfe5b877f3f6b0e8c28d25bf0e18e7afa8d1bb69765ef7dcd7097737d4be9f2b7de89e3dc4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerservicesafeguards \
python314-azure-mgmt-containerservicesafeguards \
python3dist-azure-mgmt-containerservicesafeguards"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
