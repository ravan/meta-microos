SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator0-0.6+git74.9ef0de5-1.38.aarch64.rpm"
RPM_HASH = "a720d9fb10dedb63bffaf56ed933060fab80b00fd78fc98b257c9f064b12812200ff1e898d4ca4e9c2525a87e4241022bc570768e2a58755df7383ab29e29e05"

RPROVIDES:${PN} += "libturris-spectator.so.0 \
libturris-spectator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
