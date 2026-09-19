SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-azure-cognitiveservices-language-luis-0.7.1-1.9.noarch.rpm"
RPM_HASH = "5d6afc54f5bf67e3ec1481d478b3c82b5de935ac3467bbb448dcb8c1ac2293293f368e7a47f27b11b098e24a1e0ea8c5cadb21fe057cd53c97c4c915dd6cd4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-language-luis \
python314-azure-cognitiveservices-language-luis \
python3dist-azure-cognitiveservices-language-luis"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-language-nspkg \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
