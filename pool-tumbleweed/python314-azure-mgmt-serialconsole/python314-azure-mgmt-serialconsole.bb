SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-serialconsole-2.0.0-1.1.noarch.rpm"
RPM_HASH = "c7c986bd0f49dc56ca4b6c6a1b3dc8c364ec794d123e0a1ca024183987d95ec4d32fa77141302cb8ec391a1de4ba46adcfbe00aee30cb36b602cc079b3511048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-serialconsole \
python314-azure-mgmt-serialconsole \
python3dist-azure-mgmt-serialconsole"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
