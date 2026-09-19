SUMMARY = "LeechCraft Azoth Shell command runner Module"
DESCRIPTION = "This package provides a shell command runner plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-shx-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "f116263835957f653d8cc1f75e043945d8719d38800b855d3d8fc553d7b3fcd18de271b65f94475c77a9ffe7a58ed55519b615058f9db986633bcc132fe7963d"

RPROVIDES:${PN} += "leechcraft-azoth-shx \
libleechcraft-azoth-shx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
