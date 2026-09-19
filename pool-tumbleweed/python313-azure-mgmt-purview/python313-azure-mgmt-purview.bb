SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-purview-1.0.1-1.2.noarch.rpm"
RPM_HASH = "aa5da4bb3e6927595995f372ad8536223850e2971fd83435a908177251244f1c90cc64d0bb421466c2175fb08eb9d0f1b581687637d3423a0b38b75981a266dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-purview \
python3.13dist-azure-mgmt-purview \
python313-azure-mgmt-purview \
python3dist-azure-mgmt-purview"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
