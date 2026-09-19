SUMMARY = "Dynamic menu library inspired by dmenu"
DESCRIPTION = "Library for Bemenu, dynamic menu inspired by dmenu."
LICENSE = "MIT"

PV = "0.6.23"

RPM_NAME = "libbemenu0-0.6.23-1.12.aarch64.rpm"
RPM_HASH = "94550271acb4e3ad3138523cbf82140581684685f089f2518714d4fe17b60e055b7576c88acb51336fbb0a3a1b2e4c97ceda9548bf72d176399b54a43384f304"

RPROVIDES:${PN} += "libbemenu.so.0 \
libbemenu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
bemenu \
libc.so.6"

inherit rpm
