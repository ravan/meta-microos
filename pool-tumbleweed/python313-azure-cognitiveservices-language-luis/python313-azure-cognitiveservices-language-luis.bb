SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-azure-cognitiveservices-language-luis-0.7.1-1.9.noarch.rpm"
RPM_HASH = "b949be70e1d9ab7612dacd34a7f90f8151770fcc8cae8b40eb0bef49aed186af031c1ee46f638789b388dd1f029c03391448effc6d463c5cdb95830b8623d3c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-luis \
python3.13dist-azure-cognitiveservices-language-luis \
python313-azure-cognitiveservices-language-luis \
python3dist-azure-cognitiveservices-language-luis"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-language-nspkg \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
