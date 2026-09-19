SUMMARY = "A Terminal Program"
DESCRIPTION = "A terminal program similar to Telix(tm) (a program for calling other \
computers via modem) under MS-DOS. \
 \
If you want to access your modem with minicom, you have to be a member \
of the uucp group."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.1"

RPM_NAME = "minicom-2.11.1-2.3.aarch64.rpm"
RPM_HASH = "9275cd300db1b13a190c6f0800bcd9d78d62fa272069fa7ca1fe50b51fc451bf4dd67454338358811673a93c93bbdb5ab9a291112641afbef242c9492132dd3a"

RPROVIDES:${PN} += "minicom"

RDEPENDS:${PN} += "/usr/bin/sh \
ckermit \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
rzsz"

inherit rpm
