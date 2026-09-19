SUMMARY = "Microsoft Azure Hybridcontainerservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridcontainerservice Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-hybridcontainerservice-1.0.0-2.9.noarch.rpm"
RPM_HASH = "738ed32721f81bf8a0f7181399c8a44f1f226ab9ccba3c4e237b47fdd195617969171c39f27a2a8f9c2c74b4f76ae80923769c242d1f1997bf35a6d347201369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridcontainerservice \
python3.13dist-azure-mgmt-hybridcontainerservice \
python313-azure-mgmt-hybridcontainerservice \
python3dist-azure-mgmt-hybridcontainerservice"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
