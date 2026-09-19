SUMMARY = "Qt6 QmlLS static library"
DESCRIPTION = "The Qt6 QmlLS static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlls-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "bdff7e9bba3bf6e21e09ede737c10739d6696e8f0123373b64ec14fc4ea71dbd8762b9f53517075d7ccf39492e7f3ac0b2c870b92ec760ad6786b48b4d06ddb9"

RPROVIDES:${PN} += "cmake-Qt6QmlLSPrivate \
qt6-qmlls-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6LanguageServerPrivate \
cmake-Qt6QmlCompiler \
cmake-Qt6QmlCompilerPrivate \
cmake-Qt6QmlDomPrivate \
cmake-Qt6QmlFormatPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QmlToolingSettingsPrivate"

inherit rpm
