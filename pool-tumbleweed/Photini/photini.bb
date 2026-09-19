SUMMARY = "Digital photograph metadata (EXIF, IPTC, XMP) editing application"
DESCRIPTION = "A digital photograph metadata (EXIF, IPTC, XMP) editing application. \
 \
'Metadata' is said to mean 'data about data'. In the context of digital \
photographs, this means information that is not essential in order to display \
the image, but tells something about it. For example, a title and \
description of the scene or the date and time and the GPS coordinates of the \
camera's position when the picture was taken."
LICENSE = "GPL-3.0-or-later"

PV = "2026.3.4"

RPM_NAME = "Photini-2026.3.4-1.1.noarch.rpm"
RPM_HASH = "0bd1635c9a3d2a4a06565124dcf2006b4c12c4e14e355da6b45e91af9975ec039fa0557f7848ec3b55e6f75002a375fe4b3ed0b4fba05671f694dcf2e00e90af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Photini \
python3.13dist-photini \
python3dist-photini"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pillow \
python3-cachetools \
python3-chardet \
python3-exiv2 \
python3-filetype \
python3-platformdirs \
python3-requests \
python3-requests-oauthlib \
python3dist-pyqt6-webengine \
typelib-GExiv2"

inherit rpm
