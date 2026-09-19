SUMMARY = "Plugins for dnf5"
DESCRIPTION = "Core DNF5 plugins that enhance dnf5 with builddep, changelog, config-manager, \
copr, needs-restarting, repoclosure, repomanage, and reposync commands."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5-plugins-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "1a45b46710464d21b04eaeb47e7c325b8684124364004ccb0700f075e76e177e1b948aae2b019c69934604141a84eb8abc37dd0cb7aba9d3ab843cd6f9f92094"

RPROVIDES:${PN} += "dnf5-command-builddep \
dnf5-command-changelog \
dnf5-command-config-manager \
dnf5-command-copr \
dnf5-command-needs-restarting \
dnf5-command-repoclosure \
dnf5-command-repomanage \
dnf5-command-reposync \
dnf5-plugins"

RDEPENDS:${PN} += "dnf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl4 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libjson-c.so.5 \
librpm.so.10 \
librpmbuild.so.10 \
librpmio.so.10 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
