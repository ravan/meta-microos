SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-webpubsub-2.0.0-1.9.noarch.rpm"
RPM_HASH = "e8d6009a5b03c1f71844d9ed734c9278f7d92d5f447547a0decd69d44c63c826652bdfac6efe83b8d7d6d95b0afd54498bce3ffb2764bc362177b09d764497fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-webpubsub \
python314-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
