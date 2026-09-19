SUMMARY = "A Network Traffic Analyser - Qt UI"
DESCRIPTION = "This package contains the Qt based UI for Wireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "wireshark-ui-qt-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "419d89df9a6a61d8e206309c65c9ba42fe5dfef0faff54417fd2cdf27fc5d83aacf64ace22a3eaba75f29b1f2b2fba294a574bf4d94aee85cf1eaee2ac0972d1"

RPROVIDES:${PN} += "wireshark-ui \
wireshark-ui-gtk \
wireshark-ui-qt"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libm.so.6 \
libminizip.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libpcap.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libwireshark.so.19 \
libwiretap.so.16 \
libwsutil.so.17 \
wireshark \
xdg-utils"

inherit rpm
