SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-managementgroups-2.0.0-1.1.noarch.rpm"
RPM_HASH = "abd0ac2dbcc847b9ec8b75887e2781ec1dfa0b732bc88dbaa5740af0df1d411f8aa3c618a83da07eb234ffe6576ce5ed947afce792c6ad3a8c713c04e2ce3430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managementgroups \
python314-azure-mgmt-managementgroups \
python3dist-azure-mgmt-managementgroups"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
