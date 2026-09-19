SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-azure-mgmt-support-7.0.0-2.9.noarch.rpm"
RPM_HASH = "ede15e34587ce7343d552bef618897cff7e3df967aff7f3c752f43d1b7a2f214de4cada7d0430597a784a6a778112c2211958277d880b46d2554762998379b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-support \
python3.13dist-azure-mgmt-support \
python313-azure-mgmt-support \
python3dist-azure-mgmt-support"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
