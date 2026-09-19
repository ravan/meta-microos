SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_base-suse-devel-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "74afa1f97dcf014d00156f99624c1019420993ee815a4d5b7819ac08dcbdbf719c79729ad66de269b0d06f73da4e89a9d700a2c6e10a89e8e7835bcbb6dd971b"

RPROVIDES:${PN} += "libwx-base-devel \
libwx-base-suse-devel"

RDEPENDS:${PN} += "libwx-baseu-net-suse16-0-0 \
libwx-baseu-suse16-0-0 \
libwx-baseu-xml-suse16-0-0"

inherit rpm
