SUMMARY = "Microsoft Azure TimeSeriesInsights Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure TimeSeriesInsights Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-timeseriesinsights-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "aaac0c73ee5810d2209c41a2cbd0f9f012951ddaf4ae5a78fe427a8d63d9e39d165196fbfded37a625dddee0acb13d7af3aa09a3f46c17814b6b1bdfbba119a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-timeseriesinsights \
python314-azure-mgmt-timeseriesinsights \
python3dist-azure-mgmt-timeseriesinsights"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
