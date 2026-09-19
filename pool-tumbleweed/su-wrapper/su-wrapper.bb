SUMMARY = "The su-wrapper Runs Programs as Another User and Group"
DESCRIPTION = "su-wrapper is a little utility that allows special users to execute \
processes under another uid and gid. \
 \
It uses a table (/etc/su-wrapper.conf) to decide whatto do in certain \
situation. Therefore it walks through the table and tries to match the \
current situation (the later entries have precedence). \
 \
For more information, read /usr/share/doc/packages/su-wrapper/README."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "su-wrapper-1.2.0-500.9.aarch64.rpm"
RPM_HASH = "126e3685005084ebd77eb98b10d92b2acb257cae6094966f439c745c99eda41fe615a75e470267adce1d84dca5bfa4d929c6bc6108669fa72ce87bccc785ad3c"

RPROVIDES:${PN} += "config-su-wrapper \
su-wrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
