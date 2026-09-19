SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-1.7.2+git48-1.1.aarch64.rpm"
RPM_HASH = "670013364e5a2ae0794ac1c4940ccd0b061d4f5474cdb80276d081c7a6e889f957bb8fc916b8e731ca8836348385d54d6b0d9699cc7f72cfaa20670efe3189b7"

RPROVIDES:${PN} += "libpam-misc.so.0 \
libpam.so.0 \
libpamc.so.0 \
pam"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
group-shadow \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libeconf.so.0 \
libselinux.so.1 \
permissions \
user-root"

inherit rpm
