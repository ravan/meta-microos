SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-cognitiveservices-knowledge-nspkg-3.0.0-6.9.noarch.rpm"
RPM_HASH = "e1380b0236a42244081690c4cbb077987d78dd5d1fd94451f2ea6daa6964198c485d8d8d3c47af1cf4648797036572991ff4496625ed5e4d0e6b41268c3127f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-nspkg \
python3.13dist-azure-cognitiveservices-knowledge-nspkg \
python313-azure-cognitiveservices-knowledge-nspkg \
python3dist-azure-cognitiveservices-knowledge-nspkg"

RDEPENDS:${PN} += "python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg"

inherit rpm
