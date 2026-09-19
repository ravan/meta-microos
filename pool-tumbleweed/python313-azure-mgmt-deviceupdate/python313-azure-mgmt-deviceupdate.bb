SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-deviceupdate-1.1.0-2.9.noarch.rpm"
RPM_HASH = "94e3f026047b2f0d161ee8d49cd07c2b9dee174f1f814d58a1d186da560f83ad5c07a196350130fabec08d3ff0fb6f84a057c090e639d58bcd45f42cbd5175fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deviceupdate \
python3.13dist-azure-mgmt-deviceupdate \
python313-azure-mgmt-deviceupdate \
python3dist-azure-mgmt-deviceupdate"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
