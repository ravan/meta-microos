SUMMARY = "Libyui - Header files for the NCurses REST API plugin"
DESCRIPTION = " \
This provides a libyui REST API plugin for the Ncurses frontend. \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-rest-api-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "048cff729096248ddf147917b0f748f1352957bcb02fa2c89531914140f68755270e968f6547672583f2e253c7f6df88aca7c0159aac379d1dbcf784f30a2516"

RPROVIDES:${PN} += "libyui-ncurses-rest-api-devel"

RDEPENDS:${PN} += "glibc-devel \
libstdc++-devel \
libyui-ncurses-devel \
libyui-ncurses-rest-api16 \
libyui-rest-api-devel"

inherit rpm
