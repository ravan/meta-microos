SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b17"

RPM_NAME = "python313-azure-mgmt-rdbms-10.2.0b17-2.2.noarch.rpm"
RPM_HASH = "2fdbe0c8dca77bc94eec0294a901167f7bca285d0c3bcd4620ff9b11b799673ab0980e15527d8ceeab2a27eda502eb588596f6aea6298be07bb380ab2fb18bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-rdbms \
python3.13dist-azure-mgmt-rdbms \
python313-azure-mgmt-rdbms \
python3dist-azure-mgmt-rdbms"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
