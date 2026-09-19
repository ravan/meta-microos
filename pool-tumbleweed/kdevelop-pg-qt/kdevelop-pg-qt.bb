SUMMARY = "Parser generator for Qt/KDE based applications"
DESCRIPTION = "KDevelop-PG-Qt is a parser generator written in readable source-code and \
generating readable source-code. Its syntax was inspirated by AntLR. It \
implements the visitor-pattern and uses the Qt library. That is why it is \
ideal to be used in Qt/KDE-based applications like KDevelop."
LICENSE = "LGPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "kdevelop-pg-qt-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "733b57e51fae6b5d8efc53a1c8c3d953c6278ab020f17ae6b5d07b856b443db39002999158e22033b67dda651621b2f79885cb501bcb687d76ff37111c10446f"

RPROVIDES:${PN} += "cmake-KDevelop-PG-Qt \
cmake-KDevelopPGQt \
kdevelop-pg-qt \
kdevelop5-pg-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
