SUMMARY = "LeechCraft Proxy manager Module"
DESCRIPTION = "This package provides an advanced proxy manager for LeechCraft \
with which you can configure and use proxy servers."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-xproxy-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3af9f365ae64ed545988a069de29bf3e7f0c0b9bf8c0baeccc11d12b539dbe4469f2e9884f8537981c50b1f77a29d2bdf8cba9d7f568e93f62ac7923e2bc5092"

RPROVIDES:${PN} += "leechcraft-xproxy \
libleechcraft-xproxy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
