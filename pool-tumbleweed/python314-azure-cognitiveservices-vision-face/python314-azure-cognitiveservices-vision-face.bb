SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-azure-cognitiveservices-vision-face-0.6.1-1.9.noarch.rpm"
RPM_HASH = "40a976cc596da35eeebd3a60866a45d075262409d68e65dc6bc4abb91772cd94572f76a1fbf68fe19d9cfef8e5d3ca2250e9ed78f79e0a117f796b4eac830752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-vision-face \
python314-azure-cognitiveservices-vision-face \
python3dist-azure-cognitiveservices-vision-face"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-vision-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
