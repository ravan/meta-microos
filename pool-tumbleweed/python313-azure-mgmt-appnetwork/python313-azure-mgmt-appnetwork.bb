SUMMARY = "Microsoft Azure Appnetwork Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Appnetwork Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-appnetwork-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "35c4ab489ad8a2a46115b6d11229e1cd7da9c4f8ce19bba5a13dc531fb38ee327aa2fecb9dcbfd31ae90a6a66dd79254a07dd9daaf4abca2c0a09431ad77309e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appnetwork \
python3.13dist-azure-mgmt-appnetwork \
python313-azure-mgmt-appnetwork \
python3dist-azure-mgmt-appnetwork"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
