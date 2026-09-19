SUMMARY = "Graphical frontend for R language"
DESCRIPTION = "RKWard aims to provide an easily extensible, easy to use IDE/GUI for the \
R-project. RKWard tries to combine the power of the R-language with the \
(relative) ease of use of commercial statistics tools. Long term plans \
include integration with office suites"
LICENSE = "GPL-2.0-only"

PV = "0.8.3"

RPM_NAME = "rkward-0.8.3-1.5.aarch64.rpm"
RPM_HASH = "2ea87a262c4bdf0e1a8e682d2a3be878b2fdb3a31d7bc4736aff6cadf010366cde5e9a07728810b8281e921d3fb31111bdff9988f423b258b26fbf1cd14644ad"

RPROVIDES:${PN} += "librkward.rbackend.lib.so \
rkward"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6BreezeIcons.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
