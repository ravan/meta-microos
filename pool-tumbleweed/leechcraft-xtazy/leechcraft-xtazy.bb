SUMMARY = "LeechCraft Current user tune Module"
DESCRIPTION = "This package provides a tune wrapper plugin for LeechCraft \
with which you can get the current user tune via mpris protocol."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-xtazy-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "e14dab05e03ced4c76e2a8acdb106acab4aa9c4dab0747b59c8f509540da9901ec7630cd5bdbd0b040a05e9c1727c852ea84f3a795bbf264df9ec46fb2518868"

RPROVIDES:${PN} += "leechcraft-xtazy \
libleechcraft-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
