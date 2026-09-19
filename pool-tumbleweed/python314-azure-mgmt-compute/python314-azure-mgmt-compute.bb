SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "35.0.0"

RPM_NAME = "python314-azure-mgmt-compute-35.0.0-2.4.noarch.rpm"
RPM_HASH = "0057f8aa32931d97181c3865b99f20dd2bf02c60362aef0ce69ad191e02ca30db3bd038309405d49aecf4847763f82bf5b44cc07970cb5424a7326f0e0ce3171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-compute \
python314-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
