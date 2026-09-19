SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-cognitiveservices-search-newssearch-2.0.0-4.9.noarch.rpm"
RPM_HASH = "7014bd0d23ec1d98bbfdea11aa67bf487ee7d15936afd7b7202c01405e0ecf29d49d9f35f962c0e512de392f3709c19d4d7c30e3de20d60137cf935665e9e7aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-newssearch \
python3.13dist-azure-cognitiveservices-search-newssearch \
python313-azure-cognitiveservices-search-newssearch \
python3dist-azure-cognitiveservices-search-newssearch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrest >= 0.4.28 with python313-msrest < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-nspkg"

inherit rpm
