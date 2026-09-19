SUMMARY = "PAM module which allows executing a script"
DESCRIPTION = "This module will allow you to execute scripts during authorization, \
password changes and sessions. This is very handy if your current \
security application has no PAM support but is accessible with perl \
or other scripts."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "pam_script-1.1.9-3.9.aarch64.rpm"
RPM_HASH = "8bf0bf0119418fd26a3fb2d150dce9466e9840e57f1277405b0f46725ccdae55a258ed64fd13a9c6b42751ab2b01e58aa922039ef9a73fee29c92335c3ce40a7"

RPROVIDES:${PN} += "config-pam-script \
pam-script"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
