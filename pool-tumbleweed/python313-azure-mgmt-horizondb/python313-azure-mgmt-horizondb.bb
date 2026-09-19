SUMMARY = "Microsoft Azure Horizondb Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Horizondb Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-horizondb-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "42deb906e737a4c56d57279484e6d37a44d7b568ce629577b974e06fcc0189d5e24866c32213c98ef2136afcaefc5f8612fb45e0815f2482678d203df3632bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-horizondb \
python3.13dist-azure-mgmt-horizondb \
python313-azure-mgmt-horizondb \
python3dist-azure-mgmt-horizondb"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
