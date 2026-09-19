SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-azure-cognitiveservices-search-visualsearch-0.2.0-5.9.noarch.rpm"
RPM_HASH = "fb60a78ee770bc820017c8e22701345befaa88d8e844b0ef3c1530186cc1eed317304632c49155e531d62a08bc00330736a5c61e16e2adf6167dd8499c7ad09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-visualsearch \
python314-azure-cognitiveservices-search-visualsearch \
python3dist-azure-cognitiveservices-search-visualsearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
