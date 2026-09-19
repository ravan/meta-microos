SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.5.0"

RPM_NAME = "python314-azure-mgmt-redis-14.5.0-1.7.noarch.rpm"
RPM_HASH = "81495c4d1c093bb8826518fa0f31dde58f5701658cd312f06dc9caf1143fb2ef863553f2bfbdf6da934cd9bad5076bc6edfb2c11b5edb9b1c2241ef9acaf31a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-redis \
python314-azure-mgmt-redis \
python3dist-azure-mgmt-redis"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
