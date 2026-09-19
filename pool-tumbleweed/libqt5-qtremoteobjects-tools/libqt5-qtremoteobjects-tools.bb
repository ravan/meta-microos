SUMMARY = "Qt 5 RemoteObjects Tools"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtremoteobjects-tools-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "6a7358927de86fe19e59b788a1dde1336c796d8f17fbcee8510e7144970a963826c00caee0d656093ff5f652d872c5c597369ab78b599bcba132f3bbede02b5b"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
