SUMMARY = "A face detector for batch processing"
DESCRIPTION = "facedetect is a face detector for batch processing. It determines \
whether there is a face in an image and gives back either an exit \
code or the coordinates of each detected face, on standard output. \
 \
It provides a basic command-line interface that can be used with \
software such as ImageMagick."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "facedetect-0.1-3.9.noarch.rpm"
RPM_HASH = "30aea0995e86bd28f45dfc4d29dc91add46c197252d176635079ebea048347d86a1df0d82c0c1009f66f39540a8061a086320fba727a915daf79443761d227da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "facedetect"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-numpy \
python3-opencv"

inherit rpm
