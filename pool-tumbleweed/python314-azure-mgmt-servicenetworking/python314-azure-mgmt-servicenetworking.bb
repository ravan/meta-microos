SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-servicenetworking-2.1.0-1.1.noarch.rpm"
RPM_HASH = "7ad0af1d293b9278d58c673bf73d6923d690c1988877f068ca0756f6d3eb77b9294186f6b7ad8911fc3a457597f0c4813ff1d42ccf4f59a5c41b7e532081815e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicenetworking \
python314-azure-mgmt-servicenetworking \
python3dist-azure-mgmt-servicenetworking"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
