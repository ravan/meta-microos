SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-cognitiveservices-search-videosearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "6e2d6b962dc5ca10a45a77df5ceed9f0cfd8cd71e6d501fbf98e108256aa07b601687fb69cab77d4510bad7e6bbde09a3f3c4850107ea37e782f1a1334c6480c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-videosearch \
python314-azure-cognitiveservices-search-videosearch \
python3dist-azure-cognitiveservices-search-videosearch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
