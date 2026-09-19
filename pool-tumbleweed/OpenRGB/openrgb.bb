SUMMARY = "Open source RGB lighting control"
DESCRIPTION = "The purpose of this tool is to control RGB lights on different peripherals. \
Accessing the SMBus is a potentially dangerous operation, so exercise caution."
LICENSE = "GPL-2.0-or-later"

PV = "1.0~rc3.1+git0.g5e81e26f"

RPM_NAME = "OpenRGB-1.0~rc3.1+git0.g5e81e26f-1.1.aarch64.rpm"
RPM_HASH = "039e5cc51b21d77537985c1b8e91b772d9af99258dfe8d7f7cb95fdf4d613846ae23394f61f92b2e7b5b517aa0666adbbd8022799aa50966aaf43dad1b71793e"

RPROVIDES:${PN} += "OpenRGB"

RDEPENDS:${PN} += "OpenRGB-udev-rules \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
sysuser-shadow"

inherit rpm
