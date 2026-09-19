SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python314-azure-mgmt-azurestackhci-8.1.0-1.1.noarch.rpm"
RPM_HASH = "d94182ecfaa8740086b27b844699bd824bd5a5587919441e830922f0a7faba3e05b2becfa553768cd3feef1ccea4e69a08524d39b5a7d7c893310a4a13ca442b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-azurestackhci \
python314-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
