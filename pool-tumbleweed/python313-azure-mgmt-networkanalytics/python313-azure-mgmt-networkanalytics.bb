SUMMARY = "Microsoft Azure Networkanalytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkanalytics Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-networkanalytics-1.0.0-2.9.noarch.rpm"
RPM_HASH = "ac4fa000fcbdcd2c56d05abfd708a5417207bdc63e86e130e8a6d5407d83beb8e2b72568f1c6bdff84c3cc9b37a4e3790114b7e7a181f8c81fd3e59a30e8d821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkanalytics \
python3.13dist-azure-mgmt-networkanalytics \
python313-azure-mgmt-networkanalytics \
python3dist-azure-mgmt-networkanalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
