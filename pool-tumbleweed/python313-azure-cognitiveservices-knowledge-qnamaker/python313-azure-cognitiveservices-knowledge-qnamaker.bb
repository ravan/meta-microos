SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-azure-cognitiveservices-knowledge-qnamaker-0.3.1-1.9.noarch.rpm"
RPM_HASH = "54d64b6442a764775c4b0dd5b3009fda52ad5dc06235c9f5f43dff46151e5361d57af69025608b124e7e2e532db675efe55489205d7d9e70836cfb2c3c19667d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-qnamaker \
python3.13dist-azure-cognitiveservices-knowledge-qnamaker \
python313-azure-cognitiveservices-knowledge-qnamaker \
python3dist-azure-cognitiveservices-knowledge-qnamaker"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-knowledge-nspkg \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
