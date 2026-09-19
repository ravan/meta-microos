SUMMARY = "Examples for the qt6-networkauth modules"
DESCRIPTION = "Examples for the qt6-networkauth modules."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-networkauth-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7a5832d509e42b28487f46716692ec2a4610b01db346cba1c17dae0366b3860b86c3b6c3804357b1786bb0c6a0e3a960eafc55abe0b482b89e17a944f372b4a7"

RPROVIDES:${PN} += "qt6-networkauth-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
