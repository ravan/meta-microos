SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-azure-cognitiveservices-knowledge-qnamaker-0.3.1-1.9.noarch.rpm"
RPM_HASH = "d6dce97400d3f55784a5a19193ce7e6c5e51d25740497ed0bf371497f9489ad836ea3af84e094320582ac166bdede0f7a09bacead80c03c2adb035698a6de6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-knowledge-qnamaker \
python314-azure-cognitiveservices-knowledge-qnamaker \
python3dist-azure-cognitiveservices-knowledge-qnamaker"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-knowledge-nspkg \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
