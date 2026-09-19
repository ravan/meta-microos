SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "17.1.0"

RPM_NAME = "python313-azure-mgmt-netapp-17.1.0-1.1.noarch.rpm"
RPM_HASH = "923a8bd0cd6be6933f6af45ad24f0356e0c6f9532ff0cf4b41c94dc8776687dbb06cb6f0bbeb8cd5db3b72e7f7338060d16bcfa4d6ff78cd91a26c43279a57c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-netapp \
python3.13dist-azure-mgmt-netapp \
python313-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
