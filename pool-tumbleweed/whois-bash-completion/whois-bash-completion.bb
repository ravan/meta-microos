SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.6"

RPM_NAME = "whois-bash-completion-5.6.6-1.5.noarch.rpm"
RPM_HASH = "fca26aa5250101e100ce1af5fd43879c68f6b37c6874c11a4b5fb957054b6ec7967ca5d4a9d9542fadb33ea8984dac01b8ed375271d8424b45b02bf8ec06f6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whois-bash-completion"

RDEPENDS:${PN} += "bash-completion \
whois"

inherit rpm
