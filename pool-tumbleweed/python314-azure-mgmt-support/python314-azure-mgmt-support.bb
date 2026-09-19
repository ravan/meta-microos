SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python314-azure-mgmt-support-7.0.0-2.9.noarch.rpm"
RPM_HASH = "50b6f7edd660d718e32ddbf6a965e001314027e4315315f6efa6a63c9bbdc44513bd51784e271fe1726a727c10742082d67f41717362fd8e257e2486f5d9dd01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-support \
python314-azure-mgmt-support \
python3dist-azure-mgmt-support"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
