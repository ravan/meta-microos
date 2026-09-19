SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-cognitiveservices-search-websearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "69b63d0363fc396cdff167fca6c1ebb8b5357a4c4f2394f19ea7e15de97d6dceb7fc693bcd99ccbef422b0a43ed1fafeb6dea6ff76fa7a1799a9929c5802d8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-websearch \
python314-azure-cognitiveservices-search-websearch \
python3dist-azure-cognitiveservices-search-websearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
