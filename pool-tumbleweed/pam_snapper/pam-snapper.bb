SUMMARY = "PAM module for calling snapper"
DESCRIPTION = "A PAM module for calling snapper during user login and logout."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "pam_snapper-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "7770adb0e6663e9f3b8782d00e5f75a0445d6abe5ec1e13591b2523d162f75724cfe3a7819af40f7dd9fba74c83cec6f211ed231f275ea33715e3a131943100b"

RPROVIDES:${PN} += "pam-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
pam \
snapper \
util-linux-systemd"

inherit rpm
