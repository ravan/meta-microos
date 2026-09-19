SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.0.0~b4"

RPM_NAME = "python313-azure-mgmt-cognitiveservices-15.0.0~b4-1.1.noarch.rpm"
RPM_HASH = "fc204a48df0486c885d88603ae8157dd4a1227913cde5bca4e4b339015cac661689ec99a80288036d543a2924c896e7b136a08ec381fa9fec90577171c83695e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cognitiveservices \
python3.13dist-azure-mgmt-cognitiveservices \
python313-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
