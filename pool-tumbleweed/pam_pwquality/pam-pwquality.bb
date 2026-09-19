SUMMARY = "PAM module to disallow weak new passwords"
DESCRIPTION = "The pam_pwquality PAM module can be used instead of pam_cracklib to \
disallow weak new passwords when user's login password is changed."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "pam_pwquality-1.4.5-5.9.aarch64.rpm"
RPM_HASH = "bf346e7796eab80947adf7934bc35acef43bd2f1df7655718ec6c5b62d67ce6c1374daebfda9863125bd35ca241f0bb9eda5cc494a8181288d80fb637dd0b8f2"

RPROVIDES:${PN} += "pam-pwquality"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libpwquality.so.1 \
pam \
pam-config"

inherit rpm
