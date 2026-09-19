SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-azure-cognitiveservices-search-customsearch-0.3.1-1.9.noarch.rpm"
RPM_HASH = "030e36b00d80f42e848d1c30a3197eec5eb921ca75dbafe744a048f005edaa3a519cf3fa624a1ca8360c1c47ee26d9436113c5480024a821eb75fd4cbe2bbead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-customsearch \
python314-azure-cognitiveservices-search-customsearch \
python3dist-azure-cognitiveservices-search-customsearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
