SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-cognitiveservices-search-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "621d8173d41149324150398bf72161d4631484c0195902f8667d429fbc09d49a185b44f664cc4ebbb3fdbb4312645ce36144ec7e5abb92b907f812c7136356dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg"

inherit rpm
