SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-cognitiveservices-vision-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "0944af2d8e9f03710fbdac67f102ca4d2967a9a4090d7a982224aa84a1551a7d7bf2444d943382b3cb37d865d6fee0b510b560f8def386d670de1be1c3c9c27d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-nspkg \
python3.13dist-azure-cognitiveservices-vision-nspkg \
python313-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg"

inherit rpm
