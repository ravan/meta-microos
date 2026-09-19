SUMMARY = "Zsh Completion for gnuradio"
DESCRIPTION = "zsh command line completion support for gnuradio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-zsh-completion-3.10.12.0-4.1.noarch.rpm"
RPM_HASH = "739b27670d08136007fcc93a752a7161e6a4695922d03319be6076432309c90bc4b16668b725a6c6474b2a9713727729ada6a5a275118230131e716d519872c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-zsh-completion"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
