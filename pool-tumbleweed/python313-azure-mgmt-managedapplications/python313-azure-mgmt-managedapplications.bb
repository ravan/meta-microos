SUMMARY = "Microsoft Azure Managedapplications Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managedapplications Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-managedapplications-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "01614ee3b3428ad345fd85cfc281b215b34bdf0f764f760f6401a78f02ab946d9cf286d1a37ddfcb7fb1706a73daa7dd4cd647e01c079bf1ae8b6cbf95e4da86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managedapplications \
python3.13dist-azure-mgmt-managedapplications \
python313-azure-mgmt-managedapplications \
python3dist-azure-mgmt-managedapplications"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
