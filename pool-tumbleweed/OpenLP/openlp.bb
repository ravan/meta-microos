SUMMARY = "Open source Church presentation and lyrics projection application"
DESCRIPTION = "OpenLP is a church presentation software, for lyrics projection software, \
used to display slides of Songs, Bible verses, videos, images, and \
presentations via LibreOffice using a computer and projector."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & (MIT | GPL-2.0-only) & (MIT | BSD-3-Clause | GPL-3.0-or-later) & MIT"

PV = "3.1.7"

RPM_NAME = "OpenLP-3.1.7-1.5.noarch.rpm"
RPM_HASH = "fe656de4115d0368df7ecfb719419a7e8653a7c15a3f7527b6ca8ef51e0f16d7e54d138a8b067d9f199785fc100f210061afc7da2268e6a0c63abb6592fde809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenLP \
python3.13dist-openlp \
python3dist-openlp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-Flask \
python3-Flask-Cors \
python3-Mako \
python3-PyICU \
python3-QtAwesome \
python3-SQLAlchemy \
python3-alembic \
python3-beautifulsoup4 \
python3-chardet \
python3-dbus-python \
python3-distro \
python3-lxml \
python3-platformdirs \
python3-pyenchant \
python3-pymediainfo \
python3-qrcode \
python3-qt5 \
python3-qtwebengine-qt5 \
python3-requests \
python3-waitress \
python3-websockets \
shared-mime-info"

inherit rpm
