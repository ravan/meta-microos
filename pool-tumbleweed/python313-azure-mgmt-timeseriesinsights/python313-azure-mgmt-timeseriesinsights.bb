SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-timeseriesinsights-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "ed1cf0a6622d4ddfc72cea02c159c97ecd671f0d9771fdcd35a49c4b99412e035343acdf958cd7c94d6219c18881ffbf04392c1a7e13e29b30ee40c40aa6b4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-timeseriesinsights \
python3.13dist-azure-mgmt-timeseriesinsights \
python313-azure-mgmt-timeseriesinsights \
python3dist-azure-mgmt-timeseriesinsights"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
