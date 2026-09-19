SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-azure-mgmt-logz-1.1.1-1.7.noarch.rpm"
RPM_HASH = "3ea14f97422cf0368872c9219a966f39f526e1263c3697c01380e1782d564d7379c2ce43f38544045b3d6ae757c850a4b5edaec69df9b9afb01fd4d98401b9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-logz \
python314-azure-mgmt-logz \
python3dist-azure-mgmt-logz"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
