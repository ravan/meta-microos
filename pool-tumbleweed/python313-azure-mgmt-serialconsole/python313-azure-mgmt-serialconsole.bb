SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-serialconsole-2.0.0-1.1.noarch.rpm"
RPM_HASH = "d8927ab3a5c4078769e79e802cfed06cef6d86440a9e5563a55b3230f67001b5aff10296b22542ed6f03d874055deacd4bb3dd4a87a3e1993a85bafe97d98df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-serialconsole \
python3.13dist-azure-mgmt-serialconsole \
python313-azure-mgmt-serialconsole \
python3dist-azure-mgmt-serialconsole"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
