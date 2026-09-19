SUMMARY = "Zsh Completion for awww"
DESCRIPTION = "Zsh command-line completion support for awww."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "awww-zsh-completion-0.12.0-1.5.noarch.rpm"
RPM_HASH = "e91b89c6419e8daa2f13ce6aaf6e7368d6976984bd547849863a2e74c86606f9e1462f0c4803fdb5174773138177f10655f0467ba6a9ab13d83b78d3b8dc4a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awww-zsh-completion \
swww-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
