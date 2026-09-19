SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-cognitiveservices-vision-contentmoderator-1.0.1-1.9.noarch.rpm"
RPM_HASH = "e373895db9d29eac4d7ea1180b43784a403ee42e7bbd11eb05c0e76257ae59b8e4f48d81a0b78cbd667881cc8afc3b667dd6fb48537efdd448c592f6545a1d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-vision-contentmoderator \
python314-azure-cognitiveservices-vision-contentmoderator \
python3dist-azure-cognitiveservices-vision-contentmoderator"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-vision-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
