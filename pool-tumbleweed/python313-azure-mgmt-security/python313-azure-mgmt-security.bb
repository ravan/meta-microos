SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-azure-mgmt-security-7.0.0-1.9.noarch.rpm"
RPM_HASH = "ec0929d045c3ebd55ea5db4ce9f482324b63226501437f953644290ff9b83dee1e1f18108fe1d2d4d356865b57e1ff384954ff081ec001e4e79d756994f09ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-security \
python3.13dist-azure-mgmt-security \
python313-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
