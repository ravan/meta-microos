SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-azure-cognitiveservices-search-autosuggest-0.2.1-1.9.noarch.rpm"
RPM_HASH = "fbdf2045da656756acebf6da924878d327d766071c2a26f2497b7dd03e7b25dd25c97b257aa2e679a8851431ed81ed31daf8efec34c1c0dbd371aa0bf2c82a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-autosuggest \
python3.13dist-azure-cognitiveservices-search-autosuggest \
python313-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.6.21 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg"

inherit rpm
