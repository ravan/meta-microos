SUMMARY = "Qt 5 State Chart XML tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains tools for handling Qt SCXML files."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtscxml-tools-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a54da7850be6e98fa1e665fcd82518ab522459b13c9551a3cba2425ffbac3175051065b316c60e9e79756457db4a8658593bc66cec931b689ff68f1e1cb154d6"

RPROVIDES:${PN} += "libqt5-qtscxml-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
