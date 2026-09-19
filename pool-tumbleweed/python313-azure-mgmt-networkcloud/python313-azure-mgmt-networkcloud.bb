SUMMARY = "Microsoft Azure Networkcloud Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkcloud Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-azure-mgmt-networkcloud-2.2.0-1.4.noarch.rpm"
RPM_HASH = "a35387b949567cc3830a3d563f4944a11743014371233d9d552446c7fec1aa7960f12e44c73f47babd3667ce268c08b2e63962bb08962c683a3605acc5501c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkcloud \
python3.13dist-azure-mgmt-networkcloud \
python313-azure-mgmt-networkcloud \
python3dist-azure-mgmt-networkcloud"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
