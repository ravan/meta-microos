SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-cognitiveservices-vision-contentmoderator-1.0.1-1.9.noarch.rpm"
RPM_HASH = "5b022a68614ba9df416aa0ab08aec605e2d074c433e860d070d0b1084f9b37579674b854f67d434e876ea7ea0b5a9294539893709c842f6c204ce232812a251d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-contentmoderator \
python3.13dist-azure-cognitiveservices-vision-contentmoderator \
python313-azure-cognitiveservices-vision-contentmoderator \
python3dist-azure-cognitiveservices-vision-contentmoderator"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-vision-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
