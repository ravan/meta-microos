SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-extendedlocation-2.0.0-1.9.noarch.rpm"
RPM_HASH = "25df0c9d31349bf8889390d26f0545e5e30779112b84df1072b1007d0860a5bc77d5105a5d182d5e5e7b3852c8b51ce0c2e1a6b73876b94ff14926094863baae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-extendedlocation \
python3.13dist-azure-mgmt-extendedlocation \
python313-azure-mgmt-extendedlocation \
python3dist-azure-mgmt-extendedlocation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
