SUMMARY = "Modular Desktop Settings Hub"
DESCRIPTION = "Switchboard is a modular system settings hub designed for the Pantheon desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-8.0.3-1.5.aarch64.rpm"
RPM_HASH = "22e9757fe8d9f2951fe8b1cc432ee67e9c182bc415d6edace4c9549ace90592caffabaa9d33a1f46453865ef45688afd088fd33d2707cfcc253dbbabfddcfebc"

RPROVIDES:${PN} += "switchboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0"

inherit rpm
