SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-cognitiveservices-search-entitysearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "a602c19071f9cfe08b83d2cc4af00eeda312942ac4aeac80819422e7d0ac23617504aeec70bd9addcebd29db304b73fc1a4f896a6afabe0151436f7fa16b69d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-entitysearch \
python314-azure-cognitiveservices-search-entitysearch \
python3dist-azure-cognitiveservices-search-entitysearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
