SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0~b2"

RPM_NAME = "python313-azure-mgmt-signalr-2.0.0~b2-1.9.noarch.rpm"
RPM_HASH = "0ea9fe839ca8e4e8e7602e8219eaf371752095887172a15ca228da3a298f25295cb7ae286f1004edc8ef2fe8d461bdaeb56eed85cd9c4ad8ace00cb677f478e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-signalr \
python3.13dist-azure-mgmt-signalr \
python313-azure-mgmt-signalr \
python3dist-azure-mgmt-signalr"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
