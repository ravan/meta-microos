SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mgmt-oep-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "6a83859006a5269c32db6adae5079b53c094277da336308d98863a90e8ab9a1d893cfed5b0dda504362d1d264df7013895b3202468644f2062ce2663fd7873d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-oep \
python314-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
