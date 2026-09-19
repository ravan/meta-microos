SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-azure-cognitiveservices-search-customsearch-0.3.1-1.9.noarch.rpm"
RPM_HASH = "ddd65e9e2f51c62755ba9121e1a5c0cfe4c015b6b47fef5af4798b7e0818d07b3b4188412bdf55d6ec9d36d030ee6442fe4b65072cbd65e5ff5024c1f17a68b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customsearch \
python3.13dist-azure-cognitiveservices-search-customsearch \
python313-azure-cognitiveservices-search-customsearch \
python3dist-azure-cognitiveservices-search-customsearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
