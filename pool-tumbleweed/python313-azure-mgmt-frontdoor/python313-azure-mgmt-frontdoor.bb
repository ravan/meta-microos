SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-frontdoor-2.0.0-1.1.noarch.rpm"
RPM_HASH = "a8b1a5179ad4df2ae3a8b95d53a6581ee08127337becd4cdfb27995f78ba4abc53e4441402fb0175a577cd89bb1801b62247b644ff4815fa343270bcedc8d3a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-frontdoor \
python3.13dist-azure-mgmt-frontdoor \
python313-azure-mgmt-frontdoor \
python3dist-azure-mgmt-frontdoor"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
