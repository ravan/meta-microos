SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mgmt-app-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "88a0683ee5f984cc67cb21e418b2e72ab53f331f14d2c71dcdeae1d67e5d5c91153fdb21cca8ce1c83f6b89b997b6ba4f43fbb7cd54780139821bc46e115f0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-app \
python3.13dist-azure-mgmt-app \
python313-azure-mgmt-app \
python3dist-azure-mgmt-app"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
