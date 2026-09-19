SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "41.6.0"

RPM_NAME = "python314-azure-mgmt-containerservice-41.6.0-1.1.noarch.rpm"
RPM_HASH = "af6319b546f5ef233f31bfa6b841d5d17109a5f003f2ffb0116318ed46bb99a1160ddc6a74e1cd0ec97e85c1d22738648e74fe2e69c7fa048cd17ce2d700a3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerservice \
python314-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
