SUMMARY = "Plugin for the Qt5 Interface designer"
DESCRIPTION = "The qwt6-qt5-designer package contains the plugin for the Qt5 User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt5-designer-6.3.0-1.9.aarch64.rpm"
RPM_HASH = "fc0abcd95d7d20e313e89d142293d90257a3b195981ece1c06704d27542de1bb761204d1a35b53c835e12795d79bdd51dc39e4ec6d14bf57e9903fa86b3732b5"

RPROVIDES:${PN} += "libqwt-designer-plugin.so \
qwt-qt5-designer \
qwt6-qt5-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt-qt5.so.6.3 \
libstdc++.so.6 \
qwt6-qt5-devel"

inherit rpm
