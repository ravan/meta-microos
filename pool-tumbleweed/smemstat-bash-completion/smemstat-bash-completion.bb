SUMMARY = "Bash Completion for smemstat"
DESCRIPTION = "Bash completion script for smemstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "smemstat-bash-completion-0.02.13-1.11.noarch.rpm"
RPM_HASH = "b29fd70d61b8db3c3e037f67b491d1a3038465f05825f28c6d5b734bb5af5bb730dba97302d26935cc8683266cef6813c0263c6ded2c5b2ee985dfc1f8f15c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smemstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
smemstat"

inherit rpm
