SUMMARY = "Microsoft Azure Largeinstance Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Largeinstance Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-largeinstance-1.0.0~b1-1.9.noarch.rpm"
RPM_HASH = "e4fb640cc3de6e2a9a2f42fb3ffb3d2d8160ceea64cf1eba2f576fe200662fc2a4661ca26368b704086cb0002f137dd0e977ec2ccb976d5d02e57fafe2b2223d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-largeinstance \
python314-azure-mgmt-largeinstance \
python3dist-azure-mgmt-largeinstance"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
