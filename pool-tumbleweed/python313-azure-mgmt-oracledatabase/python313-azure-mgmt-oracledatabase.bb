SUMMARY = "Microsoft Azure Oracledatabase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oracledatabase Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-oracledatabase-3.0.0-1.4.noarch.rpm"
RPM_HASH = "285251ac3824dcd99080089d70636991b6be98b47054851a7a0ef526de55a6e300c2cf6d3efd71524a7d72baebe5e25658c5eb6df20e1453b89c848ea75a2d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-oracledatabase \
python3.13dist-azure-mgmt-oracledatabase \
python313-azure-mgmt-oracledatabase \
python3dist-azure-mgmt-oracledatabase"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
