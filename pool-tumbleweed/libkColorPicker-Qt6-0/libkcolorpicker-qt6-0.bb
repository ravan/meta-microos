SUMMARY = "Qt based Color Picker with popup menu"
DESCRIPTION = "QToolButton with color popup menu with lets you select a color. The popup \
featues a color dialog button which can be used to add custom colors to the \
popup menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libkColorPicker-Qt6-0-0.3.1-1.9.aarch64.rpm"
RPM_HASH = "12d949cc2e6effcf14ef351b603e99b9c78fd32daaed85c90f9b6464caac71eaea661c2a0d9cd37b1b07861b64b977cc905eeeea5a45065983c92e14be356586"

RPROVIDES:${PN} += "libkColorPicker-Qt6-0 \
libkColorPicker-Qt6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
