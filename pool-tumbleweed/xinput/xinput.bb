SUMMARY = "Utility to configure and test X input devices"
DESCRIPTION = "xinput is a utility to configure and test XInput devices."
LICENSE = "HPND & MIT"

PV = "1.6.4"

RPM_NAME = "xinput-1.6.4-1.12.aarch64.rpm"
RPM_HASH = "3e0c68c51b5a9b7612cd5e78bb2a21f14db7b0d2f1ee86de7705970399fa06c05db851c1af468e6a19debfafb58211b4fc9cfd503a761e6d938b95fd8d63ad83"

RPROVIDES:${PN} += "xinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
