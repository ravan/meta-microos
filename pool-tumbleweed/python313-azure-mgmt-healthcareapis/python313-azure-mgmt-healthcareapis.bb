SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-healthcareapis-2.1.0-1.9.noarch.rpm"
RPM_HASH = "7d5cb7bd1d1159a09efbe1894c87b11b574f3e568cab32d7ef79331be5fd3ac3d55933aa54148a240edbb79a511838e5d7e90035be5f750e2973aac0f37002cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-healthcareapis \
python3.13dist-azure-mgmt-healthcareapis \
python313-azure-mgmt-healthcareapis \
python3dist-azure-mgmt-healthcareapis"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
