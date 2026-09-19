SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-azure-mgmt-digitaltwins-7.0.0-1.9.noarch.rpm"
RPM_HASH = "1ee13df9aa27e63f688fbbf55a5484e8f16a483c53da3941c16d2db0c9ab66991f2287952b64048e496659ea5d43bca4bb64475a0ad2a6782dc1827550c2b910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-digitaltwins \
python3.13dist-azure-mgmt-digitaltwins \
python313-azure-mgmt-digitaltwins \
python3dist-azure-mgmt-digitaltwins"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
