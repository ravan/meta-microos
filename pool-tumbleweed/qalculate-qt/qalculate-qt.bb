SUMMARY = "Multi-purpose cross-platform desktop calculator"
DESCRIPTION = "Qalculate! is a multi-purpose cross-platform desktop calculator. It is \
simple to use but provides power and versatility normally reserved for \
complicated math packages, as well as useful tools for everyday needs \
(such as currency conversion and percent calculation). Features include a \
large library of customizable functions, unit calculations and conversion, \
symbolic calculations (including integrals and equations), arbitrary \
precision, uncertainty propagation, interval arithmetic, plotting, and a \
user-friendly interface (QT, GTK+ and CLI)."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "qalculate-qt-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "6249b7dd18f6db9d6d904aa9112f92185ce09952d6c2809e0fa7174f25727f66f33a445eabbcd155810cbb0598536105a201ee89cb31ba474b38a951f9ce41f4"

RPROVIDES:${PN} += "qalculate-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.23 \
libqalculate23 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
