SUMMARY = "Microsoft Azure Powerplatform Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Powerplatform Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-powerplatform-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "7bc25afa3089838c106b8075091c04ca83b6565151c1b609bfe639b5652d72233a37c5723d412d95f3d914d554cdb279aaa62001c60b8f33dc3cc700d2318386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerplatform \
python3.13dist-azure-mgmt-powerplatform \
python313-azure-mgmt-powerplatform \
python3dist-azure-mgmt-powerplatform"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
