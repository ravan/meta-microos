SUMMARY = "Console Mouse Support"
DESCRIPTION = "The gpm (general purpose mouse) daemon is a mouse server for \
applications running on the Linux console. It provides cut and paste \
operations. If a gpm-aware program, such as mc (Midnight Commander) \
or w3m (a text-based web browser), is active, they will use to gpm to \
receive mouse events and do custom handling."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-1.20.7-23.4.aarch64.rpm"
RPM_HASH = "3f7ef5005484bc4cf8749c8d4cec3e9f0d389e80fb6d1e942db998f066f2fb721069268a85ff68ce5424b17aece3986a0688a52f0e74f097b882371fac90d669"

RPROVIDES:${PN} += "config-gpm \
gpm \
select"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpm.so.2 \
systemd"

inherit rpm
