SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.1"

RPM_NAME = "python314-azure-mgmt-appplatform-10.0.1-1.5.noarch.rpm"
RPM_HASH = "07e4152cd0fd2eb4a3b32a8308ba0030ca7d93cd185ea23f4466efb9146b472c83f046c7c0b1313cbe326c6715604cc5403e3845ff7f9e60e208ac958a073ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-appplatform \
python314-azure-mgmt-appplatform \
python3dist-azure-mgmt-appplatform"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
