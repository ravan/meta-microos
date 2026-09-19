SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python314-azure-batch-15.1.0-1.2.noarch.rpm"
RPM_HASH = "6041b53bc95708c1690dfcd1bd904e4a764c5c086b1d822ada5b5486bffbdf549e582d1ac9308f605387cf254ff640ad65d2ea4edadf1344636dea95c03dbb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-batch \
python314-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "-python314-azure-core >= 1.37.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
