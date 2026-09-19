SUMMARY = "WLAN Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The WaveLAN plugin can monitor a wireless LAN interface and display signal \
state, quality and the network name (SSID)."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "xfce4-wavelan-plugin-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "a794c1d07a9adabceb18855d780c41fe960899c3423b73d52859dce4bda08a5a55fe4d2c7a7c6ee35f76f148d2abc82cc132736bd79db9e463e3dd3f1edd4363"

RPROVIDES:${PN} += "libwavelan.so \
xfce4-panel-plugin-wavelan \
xfce4-wavelan-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
