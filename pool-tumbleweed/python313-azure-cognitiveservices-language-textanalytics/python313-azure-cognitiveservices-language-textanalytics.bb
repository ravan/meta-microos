SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python313-azure-cognitiveservices-language-textanalytics-0.2.2-1.9.noarch.rpm"
RPM_HASH = "8e308f6b235d3bf08c4990493b42d19be3a81b22d4111d9fdd9f1c0d17d7f04a48cbed37804c7dfb0e17074da7c6e398110bdf8f9e0164f01c285a4189916bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-textanalytics \
python3.13dist-azure-cognitiveservices-language-textanalytics \
python313-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-language-nspkg \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
