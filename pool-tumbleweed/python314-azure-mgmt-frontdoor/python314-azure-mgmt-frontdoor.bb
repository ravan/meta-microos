SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-frontdoor-2.0.0-1.1.noarch.rpm"
RPM_HASH = "c0135d5a59f5e5e2876e8aa2e09cd7660a071210c0d8a75a7ebff7c68ad0dc81acf196426bfc7f6c5b2cf584a32f104cf2c008222c2a672e82d4af5196871c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-frontdoor \
python314-azure-mgmt-frontdoor \
python3dist-azure-mgmt-frontdoor"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
