SUMMARY = "Calculator plugin for the Xfce4 panel"
DESCRIPTION = "xfce4-calculator-plugin is a calculator plugin for the Xfce4 panel."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "xfce4-calculator-plugin-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "a6ab39120cd15effdbec8a6f193714246719e11c1dcd1790bdfe233371263b359020880488009572986727c835b922f7fcd51dd83182f6b12db0607b282e7da9"

RPROVIDES:${PN} += "libcalculator.so \
xfce4-calculator-plugin \
xfce4-panel-plugin-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
