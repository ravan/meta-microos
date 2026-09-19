SUMMARY = "Microsoft Azure Databasewatcher Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Databasewatcher Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-databasewatcher-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "93067ec09505e264b72ab5d5231f45bd77b12bc3805e0532b15b322ef87c2708d9b4812596674cc509769adb100adf7dbadbd57a64f9e56767de924ca6304949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-databasewatcher \
python314-azure-mgmt-databasewatcher \
python3dist-azure-mgmt-databasewatcher"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
