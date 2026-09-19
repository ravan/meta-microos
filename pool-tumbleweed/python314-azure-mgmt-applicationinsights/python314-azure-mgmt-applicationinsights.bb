SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-azure-mgmt-applicationinsights-4.1.0-1.7.noarch.rpm"
RPM_HASH = "657c5fe8015c096e5203b07ee3fadeb9f805c4c922f7edb140392013019b9f151901aec081f60ef4ada2bee950ffe1159f7855058df1dfcc74252da6326613dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-applicationinsights \
python314-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
