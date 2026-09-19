SUMMARY = "Bash Completion for k6"
DESCRIPTION = "Bash command line completion support for k6."
LICENSE = "AGPL-3.0"

PV = "2.1.0"

RPM_NAME = "k6-bash-completion-2.1.0-1.3.noarch.rpm"
RPM_HASH = "59d0dab315f1b4dd2f4a1453f3077ae9806df7e1227251b222cb6c58bcd7c8b1b1a3d5afe1defea61ac15674da7e6dd5d74697fa55c0848fe49e555627d5102e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k6-bash-completion"

RDEPENDS:${PN} += "bash-completion \
k6"

inherit rpm
