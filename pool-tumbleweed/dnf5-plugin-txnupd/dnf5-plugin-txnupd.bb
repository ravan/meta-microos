SUMMARY = "Plugin for dnf5 to implement transactional updates"
DESCRIPTION = "This package contains the plugin to implement transactional updates \
as a dnf5 plugin. This plugin hooks into dnf5 to expose actions in the CLI."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "dnf5-plugin-txnupd-0.3.0-2.2.aarch64.rpm"
RPM_HASH = "724b46d0ab2ababa3915c20ca38241b6cfa3cf2648ea7b8de9f4df6b477f268d850995e4badfbc167f06c85656fa97df02ae647896889ae58d9d51b55225f489"

RPROVIDES:${PN} += "dnf5-command-txnupd \
dnf5-plugin-txnupd"

RDEPENDS:${PN} += "dnf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-cli.so.3 \
libdnf5-plugin-txnupd \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtukit.so.8"

inherit rpm
