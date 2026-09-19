SUMMARY = "Microsoft Azure Onlineexperimentation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Onlineexperimentation Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-onlineexperimentation-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "703c9a2699e0cde35f78929cd08b15a0d33a97e1c53a5b0f477378705c7ef98eecc946b2cb0d291b4b14b9af70c5579d8eae688ac36143a32be303abfda0a2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-onlineexperimentation \
python3.13dist-azure-mgmt-onlineexperimentation \
python313-azure-mgmt-onlineexperimentation \
python3dist-azure-mgmt-onlineexperimentation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
