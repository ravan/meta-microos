SUMMARY = "Qt5 Script examples"
DESCRIPTION = "Examples for libqt5-qtscript module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19"

RPM_NAME = "libqt5-qtscript-examples-5.15.19-1.3.aarch64.rpm"
RPM_HASH = "fae15c122bb1c62f0fafb3fc5b1fcc5eb578630d2cb699c1e50153cfdfde0cfb302710d3ef762ddb99a651f2ba90afa3bb6ba9d8e350f3e690b981ca78e821de"

RPROVIDES:${PN} += "libqt5-qtscript-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
