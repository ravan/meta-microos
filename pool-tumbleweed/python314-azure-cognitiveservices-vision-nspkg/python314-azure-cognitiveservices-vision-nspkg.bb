SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-cognitiveservices-vision-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "a35a98e455c3eb02ac88652a87bf947b309e035b1243a277ccffad8b00867d3baf05a54a09e324d5832a6c5e95f7e7d11d61bbaa87fd3ee9c42727c4ad8e965b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-vision-nspkg \
python314-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg"

inherit rpm
