SUMMARY = "User-Specific Process Accounting"
DESCRIPTION = "This package contains the programs necessary for user-specific process \
accounting: sa, accton, and lastcomm."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "acct-6.6.4-8.6.aarch64.rpm"
RPM_HASH = "ea9bf57fd97deaf23acc2e7461ad0e6191fbba8716e1a97fc1a6eb01bdd4c618b8ed80076dc921a2e97e9546c2a49d16599fc3f82db00a82212e74cbdee9a49e"

RPROVIDES:${PN} += "acct \
config-acct"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
logrotate"

inherit rpm
