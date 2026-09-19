SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-baremetalinfrastructure-1.0.1-1.2.noarch.rpm"
RPM_HASH = "a37156ef0599e4390ba8d74fbcab83548b03df386b9ef82d26a89b22896fd7c16c0be18945be75e068b88f98ffa5ec1dfa604a0117bdf4e24d792472c0cb4bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-baremetalinfrastructure \
python3.13dist-azure-mgmt-baremetalinfrastructure \
python313-azure-mgmt-baremetalinfrastructure \
python3dist-azure-mgmt-baremetalinfrastructure"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
