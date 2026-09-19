SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-resourceconnector-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "38f7fd365db3f108f27d218e38dd88b60634d3a37913c57cd74fe0601feb32b73452bb52c7d7a67d5d025edbf92fd8c786071f1fda07ed0f3bd1605e585af466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resourceconnector \
python314-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
