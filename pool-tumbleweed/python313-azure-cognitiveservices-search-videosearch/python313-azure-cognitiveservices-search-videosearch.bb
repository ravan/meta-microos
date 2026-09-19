SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-cognitiveservices-search-videosearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "64074b23ff0b4c7004d22db6a014be4705296093e57d44b0c4557c145be7a6e8494c8f4d752ebfd14477c63ea498d841a6b559abd42b839873015b4c697f5145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-videosearch \
python3.13dist-azure-cognitiveservices-search-videosearch \
python313-azure-cognitiveservices-search-videosearch \
python3dist-azure-cognitiveservices-search-videosearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
