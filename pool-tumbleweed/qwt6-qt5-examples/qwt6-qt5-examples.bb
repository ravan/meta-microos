SUMMARY = "Example programs using Qwt(Qt5)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt5) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "qwt6-qt5-examples-6.3.0-1.9.aarch64.rpm"
RPM_HASH = "07cabc83ae086c9c19b9c040a53d9ddf83a994c5b4bbce5dee6d4b75909f4fe443ef6747d0019b8946b2624ef4e49ca7ceeef703444a1ee4959aeda0f4375a62"

RPROVIDES:${PN} += "qwt6-qt5-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqwt-qt5.so.6.3 \
libstdc++.so.6 \
qwt6-qt5-devel"

inherit rpm
