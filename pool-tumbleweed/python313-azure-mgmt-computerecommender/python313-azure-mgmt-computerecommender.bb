SUMMARY = "Microsoft Azure Computerecommender Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computerecommender Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-computerecommender-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "ab8d17dca7aab350fe12e5fb2b4b8432623ed2312e497c0e13b87c3ba3037eb78ed800165660aa58cc9ac3dcd96d338d19ce8681d296fa048bd6d7e5d47415de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-computerecommender \
python3.13dist-azure-mgmt-computerecommender \
python313-azure-mgmt-computerecommender \
python3dist-azure-mgmt-computerecommender"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
