SUMMARY = "Non-linear video editor with broad format support"
DESCRIPTION = "OpenShot Video Editor is a non-linear video editor. It can create and \
edit videos and movies using many video, audio, and image formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "openshot-qt-4.0.0-1.1.noarch.rpm"
RPM_HASH = "99b12b1035aa93e0aa2a8f2c5ab0d38dfc958f78fad4a5f1430c94041228f0249ff1e5ba37acdb36c4dbf8dd86f3bd11239a14689b45b41ce43e19b79975d228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openshot \
openshot-qt \
python3.13dist-openshot-qt \
python3dist-openshot-qt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-openshot \
python3-pyzmq \
python3-qt6 \
python3-requests"

inherit rpm
