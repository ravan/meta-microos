SUMMARY = "Next generation RPM package manager"
DESCRIPTION = "DNF5 is a command-line package manager that automates the process of installing, \
upgrading, configuring, and removing computer programs in a consistent manner. \
It supports RPM packages, modulemd modules, and comps groups & environments."
LICENSE = "GPL-2.0-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "705b577af02a210d208ad851c4ecdebfa07aab847d1e330ce910e9a299ad7f662ccea404509acb56a5e5da9a7b6d0340a1f3b6ab10bf4fef117e7ab37f009c1c"

RPROVIDES:${PN} += "config-dnf5 \
dnf \
dnf5 \
dnf5-command-advisory \
dnf5-command-autoremove \
dnf5-command-check \
dnf5-command-check-upgrade \
dnf5-command-clean \
dnf5-command-distro-sync \
dnf5-command-downgrade \
dnf5-command-download \
dnf5-command-environment \
dnf5-command-group \
dnf5-command-history \
dnf5-command-info \
dnf5-command-install \
dnf5-command-leaves \
dnf5-command-list \
dnf5-command-makecache \
dnf5-command-mark \
dnf5-command-module \
dnf5-command-offline \
dnf5-command-provides \
dnf5-command-reinstall \
dnf5-command-remove \
dnf5-command-repo \
dnf5-command-repoquery \
dnf5-command-search \
dnf5-command-swap \
dnf5-command-system-upgrade \
dnf5-command-upgrade \
dnf5-command-versionlock \
microdnf \
yum"

RDEPENDS:${PN} += "/usr/bin/sh \
dnf-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
librpm.so.10 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
