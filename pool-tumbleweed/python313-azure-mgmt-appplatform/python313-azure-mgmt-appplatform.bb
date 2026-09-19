SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.1"

RPM_NAME = "python313-azure-mgmt-appplatform-10.0.1-1.5.noarch.rpm"
RPM_HASH = "39f2cbbc8bb5748fb8865065bda610b33b6589a17e42205eceb3fc2552c5ee8b3dbe62c972505f69e994a7ef77a9b11a30b57768a81339d12c60a4d4cdb3f312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appplatform \
python3.13dist-azure-mgmt-appplatform \
python313-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
