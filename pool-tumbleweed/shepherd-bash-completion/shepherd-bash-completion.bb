SUMMARY = "Bash Completion for shepherd"
DESCRIPTION = "Bash completion script for shepherd."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "shepherd-bash-completion-0.10.2-1.10.noarch.rpm"
RPM_HASH = "82fca12eb510d0237aec5a73162765bd606d63a284826b4b5594063f818bce1226e27e47ac1efd963b3c7b4375d6445b2ce3ea4b80848f6ca8a806edb5e4372f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shepherd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
shepherd"

inherit rpm
