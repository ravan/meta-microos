SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-azure-cognitiveservices-vision-computervision-0.9.1-1.9.noarch.rpm"
RPM_HASH = "5d72e6423b6c7f08ba2e6e28951e6f2aba5e6970fd060ba433542030e771f11873c93544312f1d6700252a9adef93910519b26d8e44d6cf4a2a3e3b411ee71e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-computervision \
python3.13dist-azure-cognitiveservices-vision-computervision \
python313-azure-cognitiveservices-vision-computervision \
python3dist-azure-cognitiveservices-vision-computervision"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-vision-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
