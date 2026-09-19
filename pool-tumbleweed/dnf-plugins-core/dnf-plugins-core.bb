SUMMARY = "Core Plugins for DNF"
DESCRIPTION = "Core Plugins for DNF. This package enhances DNF with the builddep, config-manager, \
debug, debuginfo-install, download, groups-manager, \
needs-restarting, repoclosure, repograph, repomanage, and reposync commands. \
Additionally, it provides the generate_completion_cache passive plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "dnf-plugins-core-4.10.1-1.6.noarch.rpm"
RPM_HASH = "7770da49c7722018699efb18f8279f63ef7dd5d0f372a5b3839e6ed54dfcdb27163e537481dedfb58f2e246f12499479541bec88a18513f8369a8144c19eb41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dnf-plugins-core \
dnf-command-builddep \
dnf-command-changelog \
dnf-command-config-manager \
dnf-command-copr \
dnf-command-debug-dump \
dnf-command-debug-restore \
dnf-command-debuginfo-install \
dnf-command-download \
dnf-command-groups-manager \
dnf-command-offline-distrosync \
dnf-command-offline-upgrade \
dnf-command-repoclosure \
dnf-command-repodiff \
dnf-command-repograph \
dnf-command-repomanage \
dnf-command-reposync \
dnf-command-system-upgrade \
dnf-plugin-builddep \
dnf-plugin-config-manager \
dnf-plugin-debuginfo-install \
dnf-plugin-download \
dnf-plugin-generate-completion-cache \
dnf-plugin-groups-manager \
dnf-plugin-needs-restarting \
dnf-plugin-repoclosure \
dnf-plugin-repograph \
dnf-plugin-repomanage \
dnf-plugin-reposync \
dnf-plugin-system-upgrade \
dnf-plugins-core \
dnf-plugins-extras-debug \
dnf-plugins-extras-repoclosure \
dnf-plugins-extras-repograph \
dnf-plugins-extras-repomanage"

RDEPENDS:${PN} += "python3-dnf-plugins-core"

inherit rpm
