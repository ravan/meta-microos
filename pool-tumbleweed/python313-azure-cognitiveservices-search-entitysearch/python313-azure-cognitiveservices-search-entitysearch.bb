SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-cognitiveservices-search-entitysearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "32b3cdb7c6cb82e45037a0f4fc4c44dfaeee353692edaec6211bbecc594790ea660aaaca7df9a3ce18036313d5021c67fc43ed505912626e2658da074316ef55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-entitysearch \
python3.13dist-azure-cognitiveservices-search-entitysearch \
python313-azure-cognitiveservices-search-entitysearch \
python3dist-azure-cognitiveservices-search-entitysearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
