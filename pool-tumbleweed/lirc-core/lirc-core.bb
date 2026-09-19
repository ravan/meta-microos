SUMMARY = "LIRC core, always needed to run LIRC"
DESCRIPTION = "The LIRC core contains the lircd daemons, the devinput and \
default driver and most of the applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-core-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "9969b2fdbad302fbdc55a577484ababf6e71d95369008be51e6860ff8b383e5a74db9889273203c81041536f76cc28621cdc6f6331fe84a72af2227f047e6ce0"

RPROVIDES:${PN} += "config-lirc-core \
group-lirc \
lirc \
lirc-core \
user-lirc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libirrecord.so.0 \
liblirc-client.so.0 \
liblirc-driver.so.0 \
liblirc.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
python-abi \
shadow \
systemd \
typelib-GLib \
typelib-GObject \
typelib-Gtk \
typelib-Vte"

inherit rpm
