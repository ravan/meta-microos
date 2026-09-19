SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-dynatrace-3.0.0-1.1.noarch.rpm"
RPM_HASH = "ca02da89b033d5f72b82505cbe352eb397aeaeb864ac5adb077462787db4019fa783becce83d9d320152d4ebf712c1ff7f444f594f880d1a06e21b58863cf892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dynatrace \
python3.13dist-azure-mgmt-dynatrace \
python313-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
