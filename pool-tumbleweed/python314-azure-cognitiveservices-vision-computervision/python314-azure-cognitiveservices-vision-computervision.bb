SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-azure-cognitiveservices-vision-computervision-0.9.1-1.9.noarch.rpm"
RPM_HASH = "51a748b43f853587140b3027d717e591fa59d5e681a1a5dcc23845ddd166b1cd595ceb8cd861b4b395f5971739539c1c032cca30ca29ee10b9890c294c4c8362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-vision-computervision \
python314-azure-cognitiveservices-vision-computervision \
python3dist-azure-cognitiveservices-vision-computervision"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-vision-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
