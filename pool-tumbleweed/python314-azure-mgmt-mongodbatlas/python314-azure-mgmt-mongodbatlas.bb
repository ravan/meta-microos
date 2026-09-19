SUMMARY = "Microsoft Azure Mongodbatlas Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mongodbatlas Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-mongodbatlas-1.0.0-1.5.noarch.rpm"
RPM_HASH = "b87b90f83f9258fd8c5d3d641d7f4c021474935d96ea779518f7569cdc8273c628d6453065d05827c1cfc954592cf8270531234ebe688a824ad90da17c4baabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-mongodbatlas \
python314-azure-mgmt-mongodbatlas \
python3dist-azure-mgmt-mongodbatlas"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
