SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-cognitiveservices-language-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "a112d4ca75c2c1679e548fd0de527fc757c8d27d0277b4a894495ced1670a0b3b925785ddcded98082f11ba1c6d2e23977a9ca8e04716ceb78b66a1f8143bce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-nspkg \
python3.13dist-azure-cognitiveservices-language-nspkg \
python313-azure-cognitiveservices-language-nspkg \
python3dist-azure-cognitiveservices-language-nspkg"

RDEPENDS:${PN} += "python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg"

inherit rpm
