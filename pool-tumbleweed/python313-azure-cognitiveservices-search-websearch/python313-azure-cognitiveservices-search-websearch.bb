SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-cognitiveservices-search-websearch-2.0.1-1.9.noarch.rpm"
RPM_HASH = "c727051e0d50c13468dd549231fcd26d241444bc690dd224f25d5a14d4226e09fe1e325aae97b18e5c38774a31978362b865e916e48ae935e076286af15af2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-websearch \
python3.13dist-azure-cognitiveservices-search-websearch \
python313-azure-cognitiveservices-search-websearch \
python3dist-azure-cognitiveservices-search-websearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
