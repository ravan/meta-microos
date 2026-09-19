SUMMARY = "String template library"
DESCRIPTION = "The goal of KTextTemplate is to make it easier for application developers to \
separate the structure of documents from the data they contain, opening the door \
for theming and advanced generation of other text such as code."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktexttemplate-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0ef1d6a509881f111c4d45358ccaa564ff83736e4674fc75822fe8314fe93d9bad4546f7e447f8c28c438de55572da5f86074889d9b17045c9027cf227769be2"

RPROVIDES:${PN} += "kf6-ktexttemplate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6TextTemplate.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
