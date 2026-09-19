SUMMARY = "A PAM Module for KWallet signing"
DESCRIPTION = "This PAM module allows you to automatically open your kwallet \
when signing into your account."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "pam_kwallet6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "57f0c379d7486af74132d25a55c74228a04a548532f77e004733dfbbbbccbdb7e2443e3ec98e01762420b786433ada482cb81f3ad32d2d35cf484111e78f3676"

RPROVIDES:${PN} += "pam-kwallet \
pam-kwallet6"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libpam.so.0 \
pam \
pam-config \
pam-kwallet6-common"

inherit rpm
