SUMMARY = "Microsoft Azure Edgeactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeactions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-edgeactions-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "0e5b4ab9d3a7d415838c58f95c042f5db57dcf9bd6cfdb3118f3dde6e39f60f0e80e61e14c67406f28ddab8af2bcef53dd608537a237ec6ccdb15f22770fae6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-edgeactions \
python314-azure-mgmt-edgeactions \
python3dist-azure-mgmt-edgeactions"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
