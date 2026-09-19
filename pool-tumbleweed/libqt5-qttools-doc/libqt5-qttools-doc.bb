SUMMARY = "Qt 5 tool used by Qt Developers to generate documentation"
DESCRIPTION = "Qt 5 tool used by Qt Developers to generate documentation for software projects."
LICENSE = "GPL-3.0-only"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-doc-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "b2bbf47c79fcbc21bffa3a53d290cdae30cbd5a61ff4a47c1444d49cd6b994c3d335c8c23f7000e938ea1d46f1fad16e7bc669ba90f7f2761ec3384167d30dea"

RPROVIDES:${PN} += "cmake-Qt5DocTools \
libqt5-qtbase-doc \
libqt5-qttools-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libclang-cpp23 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
