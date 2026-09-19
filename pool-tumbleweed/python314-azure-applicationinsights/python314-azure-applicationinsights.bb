SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-azure-applicationinsights-0.1.1-4.9.noarch.rpm"
RPM_HASH = "e9d77cf4c62de14685b68463a7357a7a84dac4c014ac96eee7a8a00ce68d52f09071690eb99c91d781f63b66a92415768008203507e3d339828d8a05a635252e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-applicationinsights \
python314-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
