SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-hanaonazure-1.0.1-1.2.noarch.rpm"
RPM_HASH = "a2cb3b9bae0886ee363b3e31a317cd7ea473cf5220124501b2df322de836521410597aa40db260ce6b4b5ec84505aec1316dddf55036cb86566ce7fa4ca22fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hanaonazure \
python314-azure-mgmt-hanaonazure \
python3dist-azure-mgmt-hanaonazure"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
