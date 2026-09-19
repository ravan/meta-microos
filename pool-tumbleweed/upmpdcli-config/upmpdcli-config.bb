SUMMARY = "GUI configuration editor for upmpdcli"
DESCRIPTION = "QT-based GUI for editing upmpdcli configuration files."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-config-1.9.17-1.5.aarch64.rpm"
RPM_HASH = "465ad65ee9967f9855674994ccbf63c68f4e209bd563a8dcb45ca93a0163b996669ec33360bd35af8954f9648416927b62b2ef3f00bc71eee263247c747eaf19"

RPROVIDES:${PN} += "upmpdcli-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
