SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-azure-cognitiveservices-search-visualsearch-0.2.0-5.9.noarch.rpm"
RPM_HASH = "a80fc23058fcfdb691d62c6d787c23199b31962794aa3c6805974dcb903a0b77faa0854583d68ff950d3566c0855490356af6c82f1fdb32adcb77ddb7b5219d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-visualsearch \
python3.13dist-azure-cognitiveservices-search-visualsearch \
python313-azure-cognitiveservices-search-visualsearch \
python3dist-azure-cognitiveservices-search-visualsearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
