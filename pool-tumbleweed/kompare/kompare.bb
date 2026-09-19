SUMMARY = "File Comparator"
DESCRIPTION = "Tool to visualize changes between two versions of a file."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kompare-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5b9b48fc40ffc94152a827d5a277df83220c354656f52a1887660d6b613a46b9ead6cf057ffda51c83054c5374cab97dbab82a12a12fda49cc62c7abfb48b206"

RPROVIDES:${PN} += "kompare \
kompare5 \
libkomparedialogpages.so.6 \
libkompareinterface.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkomparediff2.so.6 \
libstdc++.so.6"

inherit rpm
