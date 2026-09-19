SUMMARY = "Package manager - automated upgrades"
DESCRIPTION = "Alternative command-line interface 'dnf upgrade' suitable to be executed \
automatically and regularly from systemd timers, cron jobs or similar."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5-plugin-automatic-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "24053aca636a3c4e3c0ab43372173db0e993a26041fc18c4840406d87dc7cc54c52ea18f32411c44b2bb62a875f05a08c52e285d8b6e88cb6c4ba83f84fb4e06"

RPROVIDES:${PN} += "config-dnf5-plugin-automatic \
dnf-automatic \
dnf5-command-automatic \
dnf5-plugin-automatic"

RDEPENDS:${PN} += "/usr/bin/sh \
dnf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl4 \
libdnf5-cli.so.3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
