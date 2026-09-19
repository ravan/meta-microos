SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-azure-cognitiveservices-formrecognizer-0.1.1-4.9.noarch.rpm"
RPM_HASH = "f2d9e4f7c7f78fdab9b7355756593fc4bd911a49d01419e9915955362bb0e3778d251b4ac891091d4ed839b519442d1fa36af1f9e4ef36131a2c1634db09f693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-formrecognizer \
python314-azure-cognitiveservices-formrecognizer \
python3dist-azure-cognitiveservices-formrecognizer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
