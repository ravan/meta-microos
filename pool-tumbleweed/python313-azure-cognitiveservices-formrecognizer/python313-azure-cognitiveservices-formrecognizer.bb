SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-azure-cognitiveservices-formrecognizer-0.1.1-4.9.noarch.rpm"
RPM_HASH = "ddf0b3b01021b6b18b086c3da7e992dee3d3e355beef5b192d5e80caa15f9aa1fcfff96852c6597381dc48f1f034909bb664640c65e1271cbf1004e45de004d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-formrecognizer \
python3.13dist-azure-cognitiveservices-formrecognizer \
python313-azure-cognitiveservices-formrecognizer \
python3dist-azure-cognitiveservices-formrecognizer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
