SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-azure-mgmt-datalake-analytics-0.6.0-6.9.noarch.rpm"
RPM_HASH = "3cd55173b346fe082eea262ba593a31ce19864c8dec2e2688ce5edaa956c546f6f763a1baa171b671f66e81e5ec5d805e504a87352d3c0f9eb108d727b3665e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-analytics \
python3.13dist-azure-mgmt-datalake-analytics \
python313-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.27 with python313-msrestazure < 2.0.0 \
python-abi \
python313-azure-mgmt-datalake-nspkg \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
