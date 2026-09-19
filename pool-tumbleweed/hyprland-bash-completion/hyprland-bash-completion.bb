SUMMARY = "Bash Completion for hyprland"
DESCRIPTION = "The official bash completion script for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-bash-completion-0.56.2-1.2.noarch.rpm"
RPM_HASH = "70688ce9edf93da84137010e165bab63a12bda549177367d6ab979ec32e0670003dacc2da80502c81f84fb6377b1b1bd3910d70a20271963f0352048fd397959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-bash-completion"

RDEPENDS:${PN} += "awk \
bash-completion \
hyprland"

inherit rpm
