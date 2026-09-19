SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-cognitiveservices-search-imagesearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "6c484a0a3d5166c72e1b94afa649faa380b5bfd05879acdf7ceac16c5e7d8c19d3887068479fa864a4294b5259f0822d035f0782b765becce556e8434c0fc5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-imagesearch \
python314-azure-cognitiveservices-search-imagesearch \
python3dist-azure-cognitiveservices-search-imagesearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
