SUMMARY = "Use an Android/iOS device as a webcam on Linux"
DESCRIPTION = "DroidCam turns an Android or iOS device into a wireless (or USB) webcam. \
The virtual video device created by v4l2loopback is used by video-conferencing \
and streaming applications (Skype, Zoom, Teams, OBS Studio, etc.). \
 \
This package installs the GTK3 GUI client (droidcam). \
See the droidcam-cli sub-package for the command-line-only client."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "droidcam-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "7bc4d83101fbbe0e600b5eaa576d2d0c86edb8a27c487d7c38e49c730dfa25b17f51b29e2fd576035800d18b6a9045e418dbe2ced658559926f20516da460197"

RPROVIDES:${PN} += "droidcam"

RDEPENDS:${PN} += "hicolor-icon-theme \
kmod-v4l2loopback.ko \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libasound.so.2 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libspeex.so.1 \
libswscale.so.9 \
libturbojpeg.so.0 \
libusbmuxd-2.0.so.7"

inherit rpm
