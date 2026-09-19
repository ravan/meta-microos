SUMMARY = "Python support for KDevelop"
DESCRIPTION = "A KDevelop plugin which provides Python language support, including code \
completion and debugging using PDB."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-plugin-python3-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b7f37118ceb73a798f6884a402a78a839388df25a1b4ad7ffec70300f1923cb84793488ee7949dba5dfbaef889a161ee8bc41dbfbe3048a2dfba01d8345fd82b"

RPROVIDES:${PN} += "kdevelop-plugin-python3 \
kdevelop4-plugin-python \
libkdevpythoncompletion.so \
libkdevpythonduchain.so \
libkdevpythonparser.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevelop \
ld-linux-aarch64.so.1 \
libKDevPlatformDebugger.so.66 \
libKDevPlatformInterfaces.so.66 \
libKDevPlatformLanguage.so.66 \
libKDevPlatformOutputView.so.66 \
libKDevPlatformSerialization.so.66 \
libKDevPlatformUtil.so.66 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
