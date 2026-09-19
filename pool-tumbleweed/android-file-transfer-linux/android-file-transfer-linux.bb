SUMMARY = "Android file fransfer for Linux"
DESCRIPTION = "Android File Transfer for Linux — a MTP client with minimalist UI"
LICENSE = "LGPL-2.1-only"

PV = "4.5"

RPM_NAME = "android-file-transfer-linux-4.5-2.5.aarch64.rpm"
RPM_HASH = "3b113fd34aabe95fe111a9fa0290fecadff61cb77fb18b02309b8c80bb2c67acd4b9b65fa476843d7d5fc0551ddf0b19cb9028f8beddece60c097e1e0c41a56d"

RPROVIDES:${PN} += "android-file-transfer-linux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libfuse3.so.4 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
