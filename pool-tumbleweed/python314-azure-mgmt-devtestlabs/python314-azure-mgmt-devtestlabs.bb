SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python314-azure-mgmt-devtestlabs-9.0.1-1.2.noarch.rpm"
RPM_HASH = "d0aa2811144466ca88a305ee34b35aa137ac5eba894c2a430dfd4c337d2f9e8459e426818314e75102bc471aec6b4485ccd43d289e277bd4938452bc99c0d077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-devtestlabs \
python314-azure-mgmt-devtestlabs \
python3dist-azure-mgmt-devtestlabs"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
