SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-cognitiveservices-language-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "c75180eb12b67dc9a7b463e3d3c4a3d5a4ff0cf74f8af84825f7499f5005446721e8409abf331a744c1055f621fae06bd1ff8191dcee73228c37dcc87ec4f491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-language-nspkg \
python314-azure-cognitiveservices-language-nspkg \
python3dist-azure-cognitiveservices-language-nspkg"

RDEPENDS:${PN} += "python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg"

inherit rpm
