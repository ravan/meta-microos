SUMMARY = "Precision Time Protocol v2 daemon"
DESCRIPTION = "This software is an implementation of the Precision Time Protocol (PTP) \
according to the IEEE1588 standard for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "linuxptp-4.4-2.3.aarch64.rpm"
RPM_HASH = "db3b8b61e9afd67308980e580405391507cdc75b00c52677daf86e74c622de121e62a93d09653e1ebb096eaffa2accbae58b2b9e8ff726ab7e5ffbc16a72752e"

RPROVIDES:${PN} += "config-linuxptp \
linuxptp \
ptp-timekeeping"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
