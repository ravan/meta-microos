SUMMARY = "Computer Vision utilities"
DESCRIPTION = "Computer Vision utilities, Cohen-Sutherland line clipping, \
OpenCV plot helpers for Optical Flow and Blob Analysis, \
and AVI codec helpers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python3-morecvutils-1.1.0-1.2.noarch.rpm"
RPM_HASH = "e5dd69b4ab57cc3830de2ae495e045d091424a2fe74f534fea4c6d4ab65ba3f0885b73004c54fa82bc85ffe9928af11ba3aee4690dced623cdc294a834f5e706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-morecvutils \
python3.13dist-morecvutils \
python3dist-morecvutils"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
gstreamer-plugins-good \
python-abi \
python3-imageio \
python3-imageio-ffmpeg \
python3-numpy \
python3-opencv"

inherit rpm
