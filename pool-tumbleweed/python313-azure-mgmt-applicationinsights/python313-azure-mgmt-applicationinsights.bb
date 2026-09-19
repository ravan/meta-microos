SUMMARY = "Microsoft Azure Application Insights Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-azure-mgmt-applicationinsights-4.1.0-1.7.noarch.rpm"
RPM_HASH = "37294fb17e48c340a3194085770e65b7c30fc365cc48e7b645f2df514ad96916c6fdf231e14839d55ffe3a5d7fd895f56be3e2601eccc43b60df724e35c45139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-applicationinsights \
python3.13dist-azure-mgmt-applicationinsights \
python313-azure-mgmt-applicationinsights \
python3dist-azure-mgmt-applicationinsights"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
