SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python313-azure-mgmt-commerce-6.0.1-1.2.noarch.rpm"
RPM_HASH = "d3ad6bd0b2f43fb3a95d10e48184674af4906604919a431fd229c6c97ff00e943dd0445fc7314c8214e06e2784d409847d679cb5fd88bc202a52491ac6d4fb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-commerce \
python3.13dist-azure-mgmt-commerce \
python313-azure-mgmt-commerce \
python3dist-azure-mgmt-commerce"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
