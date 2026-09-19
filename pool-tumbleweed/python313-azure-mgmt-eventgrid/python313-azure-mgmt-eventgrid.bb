SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.4.0"

RPM_NAME = "python313-azure-mgmt-eventgrid-10.4.0-1.5.noarch.rpm"
RPM_HASH = "dc6b910a4dfa34768776a48933ec5e0370ebfb09c9b96c80da8850c4aef84a24fb05769f9c231179095c43a3605ca1e8ddb8ecd4f3c5a5a77c8d81c16c304e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventgrid \
python3.13dist-azure-mgmt-eventgrid \
python313-azure-mgmt-eventgrid \
python3dist-azure-mgmt-eventgrid"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
