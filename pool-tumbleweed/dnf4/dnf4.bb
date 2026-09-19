SUMMARY = "Package manager forked from Yum, using libsolv as a dependency resolver"
DESCRIPTION = "DNF is a package manager for RPM systems that was forked from Yum. Among the \
many improvements, it uses libsolv as a dependency resolver."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.23.0"

RPM_NAME = "dnf4-4.23.0-2.4.noarch.rpm"
RPM_HASH = "7a7626676052163545814f3e369921a6cca925f65a2bed22932cde2693a66f43fa2b41daa9a3e676fb6f5a1f871f10fbc2f2fb81f7c9dd3c53aa7180073d2fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-alias \
dnf-command-autoremove \
dnf-command-check-update \
dnf-command-clean \
dnf-command-distro-sync \
dnf-command-downgrade \
dnf-command-group \
dnf-command-history \
dnf-command-info \
dnf-command-install \
dnf-command-list \
dnf-command-makecache \
dnf-command-mark \
dnf-command-provides \
dnf-command-reinstall \
dnf-command-remove \
dnf-command-repolist \
dnf-command-repoquery \
dnf-command-repository-packages \
dnf-command-search \
dnf-command-updateinfo \
dnf-command-upgrade \
dnf4"

RDEPENDS:${PN} += "python3-dnf"

inherit rpm
