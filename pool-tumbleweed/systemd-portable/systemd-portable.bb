SUMMARY = "Systemd tools for portable services"
DESCRIPTION = "Systemd tools to manage portable services. The feature is still considered \
experimental so the package might change or vanish.  Use at own risk. \
 \
More information can be found online: \
 \
http://0pointer.net/blog/walkthrough-for-portable-services.html \
https://systemd.io/PORTABLE_SERVICES"
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-portable-261.2-1.2.aarch64.rpm"
RPM_HASH = "2f583481d636e9016e32850d483d5e56704b57eea92d34b3035f904fe0bf0d9a45604cc0761c58aac5f6f8f63b85f142b38494d1434a1a3ff3295d160f3263f7"

RPROVIDES:${PN} += "systemd-portable"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd"

inherit rpm
