SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python313-azure-mgmt-cdn-14.0.0-1.1.noarch.rpm"
RPM_HASH = "b0eab05231f409a7049159a8e438a8f6829fde6340a1495bb8400ad9638f15ce4a97e1e2c697de4a3107955bb7e5e446afde3b1d640e628df909a8a1c9d0a35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cdn \
python3.13dist-azure-mgmt-cdn \
python313-azure-mgmt-cdn \
python3dist-azure-mgmt-cdn"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
