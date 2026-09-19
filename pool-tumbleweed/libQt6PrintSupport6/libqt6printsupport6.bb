SUMMARY = "Qt 6 PrintSupport library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6PrintSupport6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "23f769b7b3b3318a1e11fbc47f1a5269e3b9dea774627f27c7f5e6c17adc0aa9f68a846584176a79aba67fd8cb3fb7438ddc7f09c3e9caf4887002d3a16778e5"

RPROVIDES:${PN} += "libQt6PrintSupport.so.6 \
libQt6PrintSupport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Widgets6 \
libc.so.6 \
libstdc++.so.6 \
qt6-printsupport-cups"

inherit rpm
