SUMMARY = "Bash Completion for alacritty"
DESCRIPTION = "The official bash completion script for alacritty. It includes support \
for every argument that can currently be passed to alacritty."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "alacritty-bash-completion-0.17.0-1.5.noarch.rpm"
RPM_HASH = "939d2d3eee758a697bcf2d1f179ba09a598a1c52725ed80c4dc49190e16ca63c8f185698646837c724979d9d92ba7fa66461d505ffc1c3f069caa8022666558e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
