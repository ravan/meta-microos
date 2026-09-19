SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.0.2"

RPM_NAME = "libassuan9-3.0.2-1.7.aarch64.rpm"
RPM_HASH = "1894ae52ff2734a12df2e42fc99b1fb326ceea46323f9ab885051cc50c684553d021e716571679fdcdeb576737fcba580bc0ceea1a0ab52881607ffd05c89396"

RPROVIDES:${PN} += "libassuan.so.9 \
libassuan9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
