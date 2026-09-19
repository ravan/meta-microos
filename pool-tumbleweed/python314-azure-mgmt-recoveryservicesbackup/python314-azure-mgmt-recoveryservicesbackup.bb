SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python314-azure-mgmt-recoveryservicesbackup-9.2.0-2.1.noarch.rpm"
RPM_HASH = "507327a248a8dfc62d1720ea9ecf29f72166ae67e39f1141fb827c551542ff6ee3a19f689cc258bf94b320c913a4ecbbe4d3ee40d946251a6394598ab55d48cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-recoveryservicesbackup \
python314-azure-mgmt-recoveryservicesbackup \
python3dist-azure-mgmt-recoveryservicesbackup"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
