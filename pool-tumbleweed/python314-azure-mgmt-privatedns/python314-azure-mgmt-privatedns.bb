SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-mgmt-privatedns-1.2.0-1.9.noarch.rpm"
RPM_HASH = "6f87491b1041e25291685fc1fd7fe33727e39e506bc17c095be93a15ec9fb67867edebd96d491db944e21162727794bf1c818741939ce6a05b2d2d9594052dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-privatedns \
python314-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
