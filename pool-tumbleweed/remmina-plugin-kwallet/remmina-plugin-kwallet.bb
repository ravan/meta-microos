SUMMARY = "Remmina plugin to support the KDE Wallet"
DESCRIPTION = "KDE Wallet plugin, that can be used instead of the GNOME Keyring"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-kwallet-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "86d6418c793dacc4bde57efc64b43e95ad81ce58bab013a0be58c2fbba0b6a4132e296f02dabd0712c736ef097d75355bcd85699c523c19cd0043823eb8c9564"

RPROVIDES:${PN} += "remmina-plugin-kwallet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
remmina"

inherit rpm
