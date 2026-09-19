SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "62c0462b24d880b90d0f8f9c5347905a21c511f0036c481c929632aa3e4c7ecf13652eaf95f92d0167447e41e2a84371143f55520b58d516ef776c4ed78fc5ed"

RPROVIDES:${PN} += "bootsplash \
plymouth \
systemd-plymouth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
plymouth-branding \
plymouth-scripts \
systemd"

inherit rpm
