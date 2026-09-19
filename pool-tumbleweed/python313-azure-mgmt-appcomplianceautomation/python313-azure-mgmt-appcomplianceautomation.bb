SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-appcomplianceautomation-1.0.0-1.9.noarch.rpm"
RPM_HASH = "a67a0166956b94bcdfbd48612f2c8258a782fa49b38a07f57f8401aaec9c6f66ae4535798252c767cbb079f538be535f58da55c4ac1577be3541cffc4a217762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcomplianceautomation \
python3.13dist-azure-mgmt-appcomplianceautomation \
python313-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
