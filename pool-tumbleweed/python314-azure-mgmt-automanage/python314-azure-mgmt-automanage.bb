SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-automanage-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "a627f4cf4f677899181e327a61fb92ccd6906afd97c6207289bb968c02c4c996402cd63895f664e34ea7459efa2d9cb8126f9ddcd9223819df39b3693c4b0892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-automanage \
python314-azure-mgmt-automanage \
python3dist-azure-mgmt-automanage"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
