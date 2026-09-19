SUMMARY = "Zsh tab-completion for flatpak"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information. \
 \
This package provides zsh tab-completion for flatpak."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "flatpak-zsh-completion-1.18.2-1.1.noarch.rpm"
RPM_HASH = "2bdb964686fb780e348e2e9309a398fdc1039769178b5fc229869c542bcd40590e40b0fa8955e040679f8608a1d6c462c30e1632e4988f0a0c3a79bc5c300a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
