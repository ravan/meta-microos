SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-azure-cognitiveservices-search-customimagesearch-0.2.1-1.9.noarch.rpm"
RPM_HASH = "323a2697f900f8187424e8cb1e10ec2562a3d78e49ada72cc573ffe122a3befe616e0e83f0da5d0638897743b8268ae31d4f67332c026cb7d83380db8d569a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-customimagesearch \
python314-azure-cognitiveservices-search-customimagesearch \
python3dist-azure-cognitiveservices-search-customimagesearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-msrest"

inherit rpm
