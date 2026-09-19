SUMMARY = "Microsoft Azure Managedops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managedops Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-managedops-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "7527fce8965c7fdca88222e924022b89b0f28e1bea2e90ef8bb755de1509a211de63474d9b0906cbb8747fdf9df5989dea8022fe3711c82ccb2d56492b5d1186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managedops \
python314-azure-mgmt-managedops \
python3dist-azure-mgmt-managedops"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
