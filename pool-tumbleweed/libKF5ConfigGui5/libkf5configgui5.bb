SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ConfigGui5-5.116.0-2.8.aarch64.rpm"
RPM_HASH = "40816c58e5388af769db93fa8c7aba9959fbf1bb76735546f6f896ad01e9e2045c07297d6c09190ed3fd007720207ec122e08454f00b3aea33c7030be7acefaf"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5 \
libKF5ConfigGui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
