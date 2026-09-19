SUMMARY = "Parallel downloader for camera and smartphone photos"
DESCRIPTION = "Rapid Photo Downloader downloads images in parallel from multiple devices, \
from every camera supported by gphoto2, including smartphones. \
 \
RPD has a timeline, which groups photos and videos based on how much \
time elapsed between consecutive shots. It can be used to identify \
photos and videos taken at different periods in a single day or over \
consecutive days."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.36"

RPM_NAME = "rapid-photo-downloader-0.9.36-3.3.noarch.rpm"
RPM_HASH = "ccbfbbcb4ca2745f1d4745629d5f7321b807fcbd2ab31e89e2cf9113fb3f6fd3cf748f0cc1dbb5ed654e156d83fba0d7cb6f009ecd42eb4d337599eb688d069f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-rapid-photo-downloader \
python3dist-rapid-photo-downloader \
rapid-photo-downloader"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
exiftool \
ifuse \
imobiledevice-tools \
libQt5Svg5 \
python-abi \
python3 \
python3-Babel \
python3-PyPrind \
python3-arrow \
python3-colorlog \
python3-colour \
python3-easygui \
python3-gobject \
python3-gobject-Gdk \
python3-gphoto2 \
python3-packaging \
python3-psutil \
python3-pymediainfo \
python3-python-dateutil \
python3-pyxdg \
python3-pyzmq \
python3-qt5 \
python3-requests \
python3-show-in-file-manager \
python3-sortedcontainers \
python3-tenacity \
python3-tornado \
typelib-GExiv2 \
typelib-GLib \
typelib-GUdev \
typelib-Gio \
typelib-Gst \
typelib-Notify \
typelib-UDisks"

inherit rpm
