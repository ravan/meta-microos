SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0~b2"

RPM_NAME = "python314-azure-mgmt-signalr-2.0.0~b2-1.9.noarch.rpm"
RPM_HASH = "9c5d5972acab64fbe50eca91065cb68420b506e89c47d8edb5ff6e9438e4eaae098f016a799f99cfe0966d5016ce1b584f82d3c3d3957b8b2848481939bb98c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-signalr \
python314-azure-mgmt-signalr \
python3dist-azure-mgmt-signalr"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
