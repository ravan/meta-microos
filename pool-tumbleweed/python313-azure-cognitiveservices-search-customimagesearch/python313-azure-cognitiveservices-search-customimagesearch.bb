SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-azure-cognitiveservices-search-customimagesearch-0.2.1-1.9.noarch.rpm"
RPM_HASH = "e9ea7092ecdfe5458a2f7ed10c4b6cd1e7aa947035de1b6fddf34e4f4e8a9c27e526f990cc54f18fda3b024fad57c2a6af6088bbb6e931808d412a89becbf734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-customimagesearch \
python3.13dist-azure-cognitiveservices-search-customimagesearch \
python313-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-msrest"

inherit rpm
