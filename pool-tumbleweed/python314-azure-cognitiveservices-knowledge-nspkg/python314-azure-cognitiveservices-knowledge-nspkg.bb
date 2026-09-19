SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-cognitiveservices-knowledge-nspkg-3.0.0-6.9.noarch.rpm"
RPM_HASH = "8eeb0c5687691fb6cb5f320716541d5a4689f6d3e0820c3a16a3152788311e487ad3a8ac03010a03c104afabc6345c7a07e9423797b35896d0ca85c2c688eb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-knowledge-nspkg \
python314-azure-cognitiveservices-knowledge-nspkg \
python3dist-azure-cognitiveservices-knowledge-nspkg"

RDEPENDS:${PN} += "python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg"

inherit rpm
