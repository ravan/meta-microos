SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python314-azure-cognitiveservices-language-textanalytics-0.2.2-1.9.noarch.rpm"
RPM_HASH = "0adf828aa936ab5833e5c6501d1a26bdabbece6ea9c409d952c389a0d522c1ca6b800d93c75710493d547bc07c3dd31ad8b59c4a77141a443dbe9f78a1880fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-language-textanalytics \
python314-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-language-nspkg \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
