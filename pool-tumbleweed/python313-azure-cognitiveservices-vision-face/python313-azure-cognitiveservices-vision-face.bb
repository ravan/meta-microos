SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-azure-cognitiveservices-vision-face-0.6.1-1.9.noarch.rpm"
RPM_HASH = "a1b6df414b80c61343eb7786713f2f99d806652d743f660807c644c6ab4144dba9b0b0c643db4466e56b27c43179d05fcfc92134bf5c577d9341e9c3ceba5cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-face \
python3.13dist-azure-cognitiveservices-vision-face \
python313-azure-cognitiveservices-vision-face \
python3dist-azure-cognitiveservices-vision-face"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-vision-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
