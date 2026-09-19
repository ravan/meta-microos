SUMMARY = "GNOME Binary Editor -- Library"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "libgtkhex-4-1-50.3-1.1.aarch64.rpm"
RPM_HASH = "703592c522751b2fc9c60a0fc873ee50ab91932c3d64a764188294c03d1cbda7c4480108bd3efcfb4e90424c759f807a848c8565586ae464a5068fc0a24a9183"

RPROVIDES:${PN} += "libgtkhex-4-1 \
libgtkhex-4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
