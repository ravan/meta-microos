SUMMARY = "Microsoft Azure Networkanalytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkanalytics Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-networkanalytics-1.0.0-2.9.noarch.rpm"
RPM_HASH = "1c05b96971a9b89d321a6e9aeb44754b40d28f05e058d49b8dfd0e051c84044089a7aeb8b469bbae5aa042610976413032746bd1239392d74cffc4f282000b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-networkanalytics \
python314-azure-mgmt-networkanalytics \
python3dist-azure-mgmt-networkanalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
