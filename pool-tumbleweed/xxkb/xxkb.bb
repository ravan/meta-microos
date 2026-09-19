SUMMARY = "A keyboard layout indicator and switcher"
DESCRIPTION = "The xxkb program is a keyboard layout switcher and indicator. Unlike the \
programs that reload keyboard maps and use their own hot-keys, xxkb is a \
simple GUI for XKB (X KeyBoard extension) and just sends commands to and \
accepts events from XKB. That means that it will work with the existing \
setup of your X Server without any modifications."
LICENSE = "Artistic-2.0"

PV = "1.11.1"

RPM_NAME = "xxkb-1.11.1-2.22.aarch64.rpm"
RPM_HASH = "bd7cbed2da9593e9b9a3e83722b13089a4db3b9e2f76a139a1b6bb0a6f0c00a27a62a4db424744ca7a4a8adce97a93b733409f6929d43a613ee9a408dbb6ac52"

RPROVIDES:${PN} += "xxkb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
