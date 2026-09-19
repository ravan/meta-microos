SUMMARY = "Qt Bootstrap module"
DESCRIPTION = "Qt Bootstrap module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Bootstrap-devel-static-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "3a4090e9d4d2b8eb0e8015a0f3dc3aed3ef5629deffcfb8a4fef7be3563d8f3f32f4a28cb6081721c0e6d7735e4682ac6742ffbb8124644919af45665121deb1"

RPROVIDES:${PN} += "libQt5Bootstrap-devel-static"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel"

inherit rpm
