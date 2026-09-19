SUMMARY = "Microsoft Azure Application Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Application Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-azure-applicationinsights-0.1.1-4.9.noarch.rpm"
RPM_HASH = "e513ecaf1374ec78356169322cf69d7a34f346170b59f1a56a9912988013a94866ddc53402dd458335569caef0c5ae80707c64124f8f5f1cb6e5804627f8649f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-applicationinsights \
python3.13dist-azure-applicationinsights \
python313-azure-applicationinsights \
python3dist-azure-applicationinsights"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
