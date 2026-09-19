SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-cognitiveservices-search-imagesearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "42c69330a045375adf2c2bf6d07744b2e8570d95d392602d3a4377fe89e44c3f7c0c3a5d7f700177b024d2e90fd1d0a7702a48e86f1c4362563be207f8e2c984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-imagesearch \
python3.13dist-azure-cognitiveservices-search-imagesearch \
python313-azure-cognitiveservices-search-imagesearch \
python3dist-azure-cognitiveservices-search-imagesearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
