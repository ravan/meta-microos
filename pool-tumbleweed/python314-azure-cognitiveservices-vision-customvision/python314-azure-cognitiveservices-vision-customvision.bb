SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python314-azure-cognitiveservices-vision-customvision-3.1.1-1.9.noarch.rpm"
RPM_HASH = "ff41bd36628643704246be9db6474dc4610c549b2e0e0af3d3c011faa5711585148ad1a02e7d0a14cef10ba34343ec898309d51e2b10734d4dcdf4801683114f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-vision-customvision \
python314-azure-cognitiveservices-vision-customvision \
python3dist-azure-cognitiveservices-vision-customvision"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-vision-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
