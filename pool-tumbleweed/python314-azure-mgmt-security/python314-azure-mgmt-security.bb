SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python314-azure-mgmt-security-7.0.0-1.9.noarch.rpm"
RPM_HASH = "faaed41b941e67e7ded1b641de55f7bc6a50f77387fa1bb74df0526d1d51a85c03cd62803dab3283d0a5f1e67177c49876358c83f0109728599382b04b7de542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-security \
python314-azure-mgmt-security \
python3dist-azure-mgmt-security"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
