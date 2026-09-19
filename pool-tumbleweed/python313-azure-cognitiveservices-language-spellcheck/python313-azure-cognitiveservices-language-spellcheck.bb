SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-cognitiveservices-language-spellcheck-2.0.1-1.9.noarch.rpm"
RPM_HASH = "2ab676528f68f33132da3f88e6472570ef20b877bd504751b4ab814eca193772f6824afda2d2afb5645b24c52960566d5594811dfa05433edf16078418483236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-spellcheck \
python3.13dist-azure-cognitiveservices-language-spellcheck \
python313-azure-cognitiveservices-language-spellcheck \
python3dist-azure-cognitiveservices-language-spellcheck"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.6.21 with python313-msrest < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-language-nspkg \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg"

inherit rpm
