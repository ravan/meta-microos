SUMMARY = "Microsoft Azure Cognitive Services Ink Recognizer Client Library"
DESCRIPTION = "Azure Ink Recognizer SDK is an SDK for developers to work with Azure Ink Recognizer Service. \
The service recognize a collection of ink strokes and return a tree hierarchy of the recognized units, \
such as lines, words, shapes, as well as the handwriting recognition result of the words. \
 \
Features: \
 \
* Connect to Azure Ink Recognizer Service \
* Convert collections of ink strokes into HTTP requests \
* Parse HTTP response into ink recognition units"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python313-azure-cognitiveservices-inkrecognizer-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "85af05fdeaf463a904f1b0b8d8cdd23a6e6344933128566a12efeef2c4b09e57312f8369499d29425c10fec8da853c7043f8633e424641898e6c4c5ea2628ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-inkrecognizer \
python3.13dist-azure-cognitiveservices-inkrecognizer \
python313-azure-cognitiveservices-inkrecognizer \
python3dist-azure-cognitiveservices-inkrecognizer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.0.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg"

inherit rpm
