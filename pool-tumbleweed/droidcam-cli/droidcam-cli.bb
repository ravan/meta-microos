SUMMARY = "Command-line client for DroidCam"
DESCRIPTION = "DroidCam turns an Android or iOS device into a wireless (or USB) webcam. \
 \
This package installs only the command-line client (droidcam-cli), which \
does not depend on GTK3.  Use it on headless systems or in terminal workflows."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "droidcam-cli-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "5901ccccc0d9275c91c8b70ca685a896bf595dcf329d1b41e31e8c76ce82723280c9ade41e7c8bfbf508001749f0fc0150f8cf7bb1e167a7aa948e38955e8122"

RPROVIDES:${PN} += "droidcam-cli"

RDEPENDS:${PN} += "kmod-v4l2loopback.ko \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libspeex.so.1 \
libswscale.so.9 \
libturbojpeg.so.0 \
libusbmuxd-2.0.so.7"

inherit rpm
