SUMMARY = "ROCS Graph Theory IDE main component library"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "librocsgraphtheory0-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "65af1bb3bd1e3aded436d830adaa8cc1cad925e6de0cda2309bc9fb846a62026eb610625b82978272824703849e003e812c18b10308e73c1d4bb761fc69740d0"

RPROVIDES:${PN} += "librocsgraphtheory.so.0 \
librocsgraphtheory0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
