SUMMARY = "Qt 5 Print Support Library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PrintSupport5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "34e411d96c4908aa4e55c1431790eede8d683ee6b8f7421596679f5a46894a90993c84fa21fb6ba3357205d1f231a2b4e5e8e00a9a166d958b04ec9bbfcd762d"

RPROVIDES:${PN} += "libQt5PrintSupport.so.5 \
libQt5PrintSupport5 \
libcupsprintersupport.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libcups.so.2 \
libstdc++.so.6"

inherit rpm
