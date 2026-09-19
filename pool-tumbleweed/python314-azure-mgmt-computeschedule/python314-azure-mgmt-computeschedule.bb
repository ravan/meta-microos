SUMMARY = "Microsoft Azure Computeschedule Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computeschedule Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-computeschedule-1.1.0-1.5.noarch.rpm"
RPM_HASH = "7ff005b904ca9feae79158b4650a7d58272c39998ab9944b67bbccf51bf2a34ce50710256541927ef0e943c5f1be3ef7a53df16c5f868819727da8987a5ee445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-computeschedule \
python314-azure-mgmt-computeschedule \
python3dist-azure-mgmt-computeschedule"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
