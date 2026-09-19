SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.4"

RPM_NAME = "v4l2loopback-utils-0.15.4-2.2.aarch64.rpm"
RPM_HASH = "34b9278b1ad3a27e72227d3ef15754da90e906f1915e232b0a3916a458fc75e837482df097a391cd4322680be4c1bb1c051bc420ae8ad6aa3d155933d6ffad33"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "libc.so.6 \
v4l-utils"

inherit rpm
