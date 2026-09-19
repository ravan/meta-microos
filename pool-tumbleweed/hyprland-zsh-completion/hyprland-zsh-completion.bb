SUMMARY = "ZSH Completion for hyprland"
DESCRIPTION = "The official zsh completion script for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-zsh-completion-0.56.2-1.2.noarch.rpm"
RPM_HASH = "4a96212f1b6812148b3c6246beeb01b6e7f27814beb5c0b45eb2b1c1074f97e671d9f88782f3b6a979ed000b293a44120bb469124f31b733a605c13966b995b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-zsh-completion"

RDEPENDS:${PN} += "awk \
hyprland \
zsh"

inherit rpm
