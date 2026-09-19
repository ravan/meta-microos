SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-cognitiveservices-nspkg-3.0.1-6.9.noarch.rpm"
RPM_HASH = "5df44fb35c3374551b16a1efee99233612fab78dae3bd4fa9b9110e50a61b1923242f64de5dfbf1d98dd1838fee89c7632a92949a4e39d199fd6abb6cafe8551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
