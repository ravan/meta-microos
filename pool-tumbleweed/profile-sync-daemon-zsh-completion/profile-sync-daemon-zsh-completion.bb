SUMMARY = "Zsh completion for profile-sync-daemon"
DESCRIPTION = "zsh completion for profile-sync-daemon."
LICENSE = "MIT"

PV = "7.04"

RPM_NAME = "profile-sync-daemon-zsh-completion-7.04-1.1.noarch.rpm"
RPM_HASH = "eaf78e2b792fda3c586323f666e4b0ca4123dd47a43e4f902a7e230478632e96981818dfa16d6ab7b044598d90da89cf0ee599de554d422d1f60716eaa1abae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon-zsh-completion"

RDEPENDS:${PN} += "profile-sync-daemon"

inherit rpm
