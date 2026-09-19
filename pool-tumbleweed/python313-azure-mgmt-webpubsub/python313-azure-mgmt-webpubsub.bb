SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-webpubsub-2.0.0-1.9.noarch.rpm"
RPM_HASH = "efce9ab2cb24b16d4228f2dbcc11554100f587ab76ac44f91475f6f8f833c5545df421e7cc3442ea1a19b06066c1e268381856d5a30a1b62cd4ce2ce2861bb43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-webpubsub \
python3.13dist-azure-mgmt-webpubsub \
python313-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
