SUMMARY = "ZSH Completion for xwallpaper"
DESCRIPTION = "Zsh shell completion for xwallpaper"
LICENSE = "ISC"

PV = "0.7.6"

RPM_NAME = "xwallpaper-zsh-completion-0.7.6-1.7.noarch.rpm"
RPM_HASH = "f9baf5c491d6a483de37520780ed0d4b46e1a59e45648574a1f87a69fdc0780613e44a55f9722afcb4a98a796aad96127d64f072aa1a3d1bee76ef326f0bbba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xwallpaper-zsh-completion"

RDEPENDS:${PN} += "xwallpaper"

inherit rpm
