SUMMARY = "Qt 5 Declarative Tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains aditional tools for inspecting, testing, viewing, etc, QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "5.15.19+kde23"

RPM_NAME = "libqt5-qtdeclarative-tools-5.15.19+kde23-1.3.aarch64.rpm"
RPM_HASH = "a34aa06f9bccc097db6d59af5fdf8798c23ac55286fefe810fca512b04d68ecafcbb8773ee05e49fa60d5dfa57ff082b66abf0aa95f23d04db6c1b489d05ecea"

RPROVIDES:${PN} += "libqt5-qtdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTest.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
