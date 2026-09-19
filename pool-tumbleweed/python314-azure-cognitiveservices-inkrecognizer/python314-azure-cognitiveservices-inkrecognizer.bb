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

RPM_NAME = "python314-azure-cognitiveservices-inkrecognizer-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "7301cb9f73f9ca6fb9d1f97e099b19e6a09bfcae25cc733a738f982f85b3ea375abf2923701f6af6db50ee270cd9fe7f0c1df44c5e0457489cc0b9a4f0bb6e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-inkrecognizer \
python314-azure-cognitiveservices-inkrecognizer \
python3dist-azure-cognitiveservices-inkrecognizer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.0.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg"

inherit rpm
