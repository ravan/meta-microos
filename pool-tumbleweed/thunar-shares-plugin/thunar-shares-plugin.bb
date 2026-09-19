SUMMARY = "Thunar Plugin for Sharing Files Using Samba"
DESCRIPTION = "The Thunar Shares Plugin allows for quickly sharing a directory using Samba \
from within Thunar without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "thunar-shares-plugin-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "ab92b31b7acf95408910ac9a3ac383ca8e860683bae3db5d17cfda7126daafe6f9e8643821b945edafd8d411abf0edeb18062682d0f1fbb14c574ff14f7219d9"

RPROVIDES:${PN} += "thunar-plugin-shares \
thunar-shares-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libthunarx-3.so.0 \
libxfconf-0.so.3 \
samba \
thunar"

inherit rpm
