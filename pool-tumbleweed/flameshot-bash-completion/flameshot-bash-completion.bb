SUMMARY = "Bash Completion for flameshot"
DESCRIPTION = "Bash completion script for flameshot's CLI."
LICENSE = "GPL-3.0-only"

PV = "14.0.0"

RPM_NAME = "flameshot-bash-completion-14.0.0-1.2.noarch.rpm"
RPM_HASH = "f61c6ac69c6969cddd45405b36f5c5907624a489514237f4b647b0008ccb344cc93e1abda839f95cba747b04f0d2a44295367825f2579e7051bf378c653d2b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flameshot"

inherit rpm
