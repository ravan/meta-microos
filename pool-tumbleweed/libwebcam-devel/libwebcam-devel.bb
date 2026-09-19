SUMMARY = "Development files for libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains development files for libwebcam."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam-devel-0.2.5-3.13.aarch64.rpm"
RPM_HASH = "a267c811d76dfbf89e1fcc242c07326960d682ff8200c1d59e5928bf041a39fd23d8e007326136a1ef1140d8a332b06ad5e9c7c89223c670a733c8e1ad7d87d9"

RPROVIDES:${PN} += "libwebcam-devel \
pkgconfig-libwebcam"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebcam0"

inherit rpm
