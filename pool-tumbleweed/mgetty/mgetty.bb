SUMMARY = "Mgetty Listens for Data, Fax, or Voice Calls on a Serial Line"
DESCRIPTION = "This package turns your computer into a fax machine. With some voice \
modems (Zyxel, Rockwell, and USR), you can even use your computer as an \
answering machine. \
 \
Mgetty recognizes what kind of call it is receiving and does everything \
else automatically. It is able to accept data (login/PPP), fax, and \
(depending on your modem) voice calls. Find the documentation in \
/usr/share/doc/packages/mgetty and TeX Info files in /usr/share/info. \
 \
The configuration files are in /etc/mgetty+sendfax."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "mgetty-1.2.1-14.1.aarch64.rpm"
RPM_HASH = "6ed8750f7f650662a9c51744a3f8d650912b503c42ad2a5d13001c970cbd84d86b6d23e434d1f1a220b6a190271cc3e2b3ac5f4aaa25374aa0789858b90ed7eb"

RPROVIDES:${PN} += "config-mgetty \
mgetty"

RDEPENDS:${PN} += "/usr/bin/sh \
g3utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
