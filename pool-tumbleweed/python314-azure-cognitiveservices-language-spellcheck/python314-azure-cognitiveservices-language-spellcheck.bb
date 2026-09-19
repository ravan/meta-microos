SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-cognitiveservices-language-spellcheck-2.0.1-1.9.noarch.rpm"
RPM_HASH = "9bf950ccaaf9a9188f15314895e3aa26d1454666df821d245f5f76039d0c862a86a005ca49c06ea8f7a912da80645466b9d9aa48df411c7071d88300de565a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-language-spellcheck \
python314-azure-cognitiveservices-language-spellcheck \
python3dist-azure-cognitiveservices-language-spellcheck"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.6.21 with python314-msrest < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-language-nspkg \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg"

inherit rpm
