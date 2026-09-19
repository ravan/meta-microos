SUMMARY = "Qt6 QmlFormat static library"
DESCRIPTION = "The Qt6 QmlFormat static library. \
This code parses .qmlformat.ini files and is required by the QmlLS static library"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlformat-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8bea99a9160126ff1707a6a00bd520e65604ccc6829bd97feb2afea8cbd12fedc18f47f7f4d536ca799db257a6f187773f29a9187e5e40765dde2659722eecf3"

RPROVIDES:${PN} += "cmake-Qt6QmlFormatPrivate \
qt6-qmlformat-devel-static"

RDEPENDS:${PN} += "cmake-Qt6QmlPrivate"

inherit rpm
