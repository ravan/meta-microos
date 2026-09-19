SUMMARY = "Single Sign On UI"
DESCRIPTION = "This package contains the user interface for the signond Single Sign On service."
LICENSE = "GPL-3.0-only"

PV = "0.17.20231016T221200~eef943f"

RPM_NAME = "signon-ui-0.17.20231016T221200~eef943f-1.8.aarch64.rpm"
RPM_HASH = "c4ac892607eaafa71ac5cfbfdade1e607af9985d79cc087eb9dffd6189fb623912480ff98a6d9d69afc25e4b3202b2b099385a292fd18ff90d5e95b8fef0e470"

RPROVIDES:${PN} += "signon-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libproxy.so.1 \
libsignon-qt6.so.1 \
libstdc++.so.6 \
qt6-webchannel-imports"

inherit rpm
