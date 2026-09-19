SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF6::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktexteditor-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "94cf2d5079f1b738a54b84dd514b563091db5d0e1abc8112f829b7aa53093c3faf9702e073f1acb0e8d677187a519dc1e3858f87c0c4f9e5a9134df9cf0faa21"

RPROVIDES:${PN} += "kf6-ktexteditor"

RDEPENDS:${PN} += "kf6-syntax-highlighting \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6TextEditor.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
