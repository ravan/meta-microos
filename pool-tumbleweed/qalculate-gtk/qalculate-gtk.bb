SUMMARY = "Multi-purpose cross-platform desktop calculator"
DESCRIPTION = "Qalculate is a multi-purpose cross-platform desktop calculator. It is \
simple to use but provides power and versatility normally reserved for \
complicated math packages, as well as useful tools for everyday needs \
(such as currency conversion and percent calculation). Features include a \
large library of customizable functions, unit calculations and conversion, \
symbolic calculations (including integrals and equations), arbitrary \
precision, uncertainty propagation, interval arithmetic, plotting, and a \
user-friendly interface (GTK+ and CLI)."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "qalculate-gtk-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "900a55ca907df0841752f211b463b3659d42a40a92a599a09e2030fef4dee70521548bfb2bb9dc73cc92f36d3e0e9d970c78e6cf0fa60bc33e045bd3aa5ec079"

RPROVIDES:${PN} += "qalculate-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libqalculate.so.23 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
