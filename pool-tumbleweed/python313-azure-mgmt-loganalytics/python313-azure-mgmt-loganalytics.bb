SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python313-azure-mgmt-loganalytics-14.0.0-1.2.noarch.rpm"
RPM_HASH = "6b8807c3d38a3d5ef60c322ebf8eb4ecb41c00a92d5d5109cd2ea6fe9dd0a5ebbb25156f36936ff17c6c08b37ca2614ec8fa752af3eade5a9545b5e329ff7d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loganalytics \
python3.13dist-azure-mgmt-loganalytics \
python313-azure-mgmt-loganalytics \
python3dist-azure-mgmt-loganalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
