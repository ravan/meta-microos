SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0.0"

RPM_NAME = "python313-azure-mgmt-sql-4.0.0.0-1.1.noarch.rpm"
RPM_HASH = "b0b20cc9a1a6972f197e628ae81ef43667da36971cbda146cabe3c71f6d3f2f1933ae76c1971e06f900a4796d134278c239d398ad07a6f8e3504d45909af2ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sql \
python3.13dist-azure-mgmt-sql \
python313-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
