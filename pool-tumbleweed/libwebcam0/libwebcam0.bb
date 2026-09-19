SUMMARY = "A library for user-space configuration of the uvcvideo driver"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam0-0.2.5-3.13.aarch64.rpm"
RPM_HASH = "5105fd4056a6e43eb2e18cba0f75b119cd8e456c172011b976b053049d2c336dd719498716b4dbefe380a1fde58354af5a2673e8ba3530a6c9a210d8d51ac2f0"

RPROVIDES:${PN} += "libwebcam.so.0 \
libwebcam0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16"

inherit rpm
