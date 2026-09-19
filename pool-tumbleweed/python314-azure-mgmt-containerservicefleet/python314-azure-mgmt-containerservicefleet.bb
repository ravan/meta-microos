SUMMARY = "Microsoft Azure Containerservicefleet Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerservicefleet Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-mgmt-containerservicefleet-4.0.0-1.1.noarch.rpm"
RPM_HASH = "2d7c034679c5c23c297ad164dd3a25cf5497100ff6e93189de77b951acbfb6bd5d3c3132d30228b6ddcc24e12a47596fdafd097dc64cd55fd7cbc1022d5dfd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerservicefleet \
python314-azure-mgmt-containerservicefleet \
python3dist-azure-mgmt-containerservicefleet"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
