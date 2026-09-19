SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python314-azure-mgmt-avs-9.1.0-1.5.noarch.rpm"
RPM_HASH = "28f0af4cc9a1f8522381c8a94a66808898af68ba359f43b58b1e7667f8491e4b95c8f122d321c9085615ca53c281697ad968455dcb2a4c4b7483925a7c6e95e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-avs \
python314-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
