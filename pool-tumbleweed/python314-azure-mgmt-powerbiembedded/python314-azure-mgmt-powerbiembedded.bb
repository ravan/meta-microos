SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-powerbiembedded-3.0.0-1.9.noarch.rpm"
RPM_HASH = "e7e72fdabd6a9c6e9d582f9bd6719c34caafc24cb960b49529bf4fffeca82c393ce10cbf457b092669c264913cd3ac0301ae8afd4282b557bd23a1daf6379966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-powerbiembedded \
python314-azure-mgmt-powerbiembedded \
python3dist-azure-mgmt-powerbiembedded"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
