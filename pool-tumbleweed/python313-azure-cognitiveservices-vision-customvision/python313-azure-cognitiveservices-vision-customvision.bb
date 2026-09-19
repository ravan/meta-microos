SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-azure-cognitiveservices-vision-customvision-3.1.1-1.9.noarch.rpm"
RPM_HASH = "5d48d148a08b6fbc1670b54b6bddb587d4e9cecd045aa31bc9521de0398c2a0e22b57cadbc090842aafcf1ee2c95d8d4b31074e26a2d8d0b504fb79a689c51ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-customvision \
python3.13dist-azure-cognitiveservices-vision-customvision \
python313-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-vision-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
