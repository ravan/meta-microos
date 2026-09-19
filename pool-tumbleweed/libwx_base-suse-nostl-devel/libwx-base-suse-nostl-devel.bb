SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_base-suse-nostl-devel-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "070b6bca7b8802e946634c8f4c7e085c739ddde61fb5a7539d81fa6e646c404bf5e80d8e7e2465e6b7ddf3952ae282940960624b8b1d5250f5c157319a6833b9"

RPROVIDES:${PN} += "libwx-base-devel \
libwx-base-suse-nostl-devel"

RDEPENDS:${PN} += "libwx-baseu-net-suse-nostl16-0-0 \
libwx-baseu-suse-nostl16-0-0 \
libwx-baseu-xml-suse-nostl16-0-0"

inherit rpm
