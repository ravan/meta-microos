SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-azure-mgmt-monitor-7.0.0-1.5.noarch.rpm"
RPM_HASH = "d6c57670240bdb1114adb5e0d3bd3ef4aff5d3d4eb90cb3d85730e51a778f6d7a8a855b0842ef21cc2085864b8b8b163484ce5f468cf9bf20a9dbc918e840d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitor \
python3.13dist-azure-mgmt-monitor \
python313-azure-mgmt-monitor \
python3dist-azure-mgmt-monitor"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
