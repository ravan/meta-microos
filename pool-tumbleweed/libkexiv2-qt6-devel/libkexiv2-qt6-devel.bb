SUMMARY = "Build environment for libkexiv2"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkexiv2-qt6-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "22d727df0f3a9b1da65f3ca17b2b3064190f1dbfc893a0fe0ad3745634c7c352176896adf117be7a6d1ba1e641d73d997e94d7bfd820f02ba88b7bfd643e1762"

RPROVIDES:${PN} += "cmake-KExiv2Qt6 \
libkexiv2-qt6-devel"

RDEPENDS:${PN} += "libKExiv2Qt6-0"

inherit rpm
