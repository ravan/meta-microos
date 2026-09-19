SUMMARY = "A PAM Module that can Mount Volumes for a User Session"
DESCRIPTION = "This module is aimed at environments with central file servers that a \
user wishes to mount on login and unmount on logout, such as \
(semi-)diskless stations where many users can logon. \
 \
The module also supports mounting local filesystems of any kind the \
normal mount utility supports, with extra code to make sure certain \
volumes are set up properly because often they need more than just a \
mount call, such as encrypted volumes. This includes SMB/CIFS, FUSE, \
dm-crypt and LUKS."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.22"

RPM_NAME = "pam_mount-2.22-1.5.aarch64.rpm"
RPM_HASH = "aa6d4f8c4f0956e31ecb8ffbe1ac49969002fd97aaa912357692f2816c1fc034017aaf3ffbe8b221428610cf3d7ec7e23075b73f5fb3dc3fb2e62a59992e11bd"

RPROVIDES:${PN} += "config-pam-mount \
pam-mount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
device-mapper \
fd0ssh \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libcryptmount.so.0 \
libcryptsetup.so.12 \
libmount.so.1 \
libpam.so.0 \
libpcre2-8.so.0 \
libxml2.so.16 \
ofl \
perl-XML-Parser \
perl-XML-Writer \
util-linux"

inherit rpm
