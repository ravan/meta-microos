SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0.0"

RPM_NAME = "python314-azure-mgmt-sql-4.0.0.0-1.1.noarch.rpm"
RPM_HASH = "8a3b0f293a20cc3892874ec5a8e3d02e1a6b99244eac770ed4d12ad921696b7b88d298db990bcf7ebdf71e19c691b09e5b35e800a51a7042dfd9c685d3fe5ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-sql \
python314-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
