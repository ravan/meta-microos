SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-cognitiveservices-search-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "a51eb47bd4c3d6b08d7f9fc1cc11d4a500e554110e9860bba5233c8ddf1fd4698d0c09b56d7119fa0f591b6dcf9de5cf5e6562e41d88a4b82468e3db1c687a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-nspkg \
python3.13dist-azure-cognitiveservices-search-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg"

inherit rpm
