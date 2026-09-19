SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-cognitiveservices-nspkg-3.0.1-6.9.noarch.rpm"
RPM_HASH = "539499a3e9317e78b783ae585f0ac145c266e2095d388707f6c15b0e1ce3fd54e95bb51cbf0d4a00f092e2fb26c7bc1913d46a97d0f232aa7457673330dcd66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-nspkg \
python3.13dist-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
