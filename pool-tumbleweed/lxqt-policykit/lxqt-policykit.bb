SUMMARY = "PolicyKit authentication agent"
DESCRIPTION = "PolicyKit authentication agent for LXQt"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-policykit-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "e0876f7ebda3c1629094d3a0dd6a5300d1fefebf50b8dcb86bc0f788e6b0224eb1064521f0205fbea27d993be72e1bedc4aaa8a8bf3b4ad835f93f61e0baf430"

RPROVIDES:${PN} += "config-lxqt-policykit \
lxqt-policykit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt.so.2 \
libpolkit-qt6-agent-1.so.1 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
