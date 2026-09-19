SUMMARY = "kseexpr libraries"
DESCRIPTION = "Runtime libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "libKSeExpr4-4.0.4.0-1.20.aarch64.rpm"
RPM_HASH = "0595758c4802ae9198e7659f8650d52a4ac45b77e2ad900e5d3b95a0e079d53224fc2fc55ed94a7ddc9f4b1945b35369583933ef84bfbccafdefbe6d664ab8ec"

RPROVIDES:${PN} += "kseexpr \
libKSeExpr.so.4 \
libKSeExpr4 \
libKSeExprUI.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
