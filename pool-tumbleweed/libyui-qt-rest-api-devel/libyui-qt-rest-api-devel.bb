SUMMARY = "Libyui - Header files for the Qt REST API plugin"
DESCRIPTION = "This provides a libyui REST API plugin for the Qt frontend. \
 \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-rest-api-devel-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "3787edb7b9f8c8a41dbdcfd5f7dd4b9227322524229443de4c5e6e15e572ce43be9db629460594219c6d3706273346495eb2d6110bae47a3300ae51a069b76a6"

RPROVIDES:${PN} += "libyui-qt-rest-api-devel"

RDEPENDS:${PN} += "glibc-devel \
libstdc++-devel \
libyui-qt-devel \
libyui-qt-rest-api16 \
libyui-rest-api-devel"

inherit rpm
