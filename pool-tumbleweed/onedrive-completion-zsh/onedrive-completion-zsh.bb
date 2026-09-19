SUMMARY = "OneDrive zsh completion"
DESCRIPTION = "OneDrive shell completions for zsh."
LICENSE = "GPL-3.0-only"

PV = "2.5.11"

RPM_NAME = "onedrive-completion-zsh-2.5.11-1.4.noarch.rpm"
RPM_HASH = "d0a3bac66890c6f3ae888889a6ade335a788fcc14cd902f45e2656b4adcc2060c2f3f801090e598c0f368a2d5132ab789b7e44844a9f1036d45f7fad09ac55db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onedrive-completion-zsh"

RDEPENDS:${PN} += "onedrive \
zsh"

inherit rpm
