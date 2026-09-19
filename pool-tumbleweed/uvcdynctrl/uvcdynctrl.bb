SUMMARY = "Command line interface to libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains command line interface to libwebcam."
LICENSE = "GPL-3.0+"

PV = "0.2.5"

RPM_NAME = "uvcdynctrl-0.2.5-3.13.aarch64.rpm"
RPM_HASH = "da67e6da056c01b01148fd472337ac5d890790d5ad5ad3783128aceb45dc44b5fc358967ea6a22b27b3de56e78612416cad56fe1ed8106ad6609287ab0cc6cc3"

RPROVIDES:${PN} += "uvcdynctrl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebcam.so.0 \
udev"

inherit rpm
