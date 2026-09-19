SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0~b2"

RPM_NAME = "python313-azure-mgmt-appconfiguration-6.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "708d759d717153ccc5db9d1bdf367480f17acd9c0ac0b3d3455b06af1825c064e36faded842b3d66f5631fe392f6afa2bd02141de1681ca075fd95e18ebd2947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appconfiguration \
python3.13dist-azure-mgmt-appconfiguration \
python313-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
