SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python314-azure-mgmt-commerce-6.0.1-1.2.noarch.rpm"
RPM_HASH = "26df9d5f0e4717e6c4327045c243db51c8422280d77c6ca5975e5ca7ed989b8c2d68f3c921e37bb48f18b23fd2a58e606dd73d222706cdfc8fa51f866150eb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-commerce \
python314-azure-mgmt-commerce \
python3dist-azure-mgmt-commerce"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
