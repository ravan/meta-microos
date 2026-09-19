SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-cognitiveservices-search-newssearch-2.0.0-4.9.noarch.rpm"
RPM_HASH = "8daad113329f91abdf3b7c5b132c56c846fb0828e2ccf6a05ca117db230db5b8c71935632f901a3f28c13ff433c4c7f969b8ebf425e944c6515cf7da8057c571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-newssearch \
python314-azure-cognitiveservices-search-newssearch \
python3dist-azure-cognitiveservices-search-newssearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrest >= 0.4.28 with python314-msrest < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg"

inherit rpm
