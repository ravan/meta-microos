SUMMARY = "Bash Completion for kiwi-ng"
DESCRIPTION = "Bash command line completion support for python-kiwi - completion \
of subcommands, parameters and keywords for the kiwi-ng command."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-bash-completion-10.3.11-1.1.noarch.rpm"
RPM_HASH = "5aa0355c5bafc87d12312efb6a1dd21ed1961735aa847e5b110a9f1bb0968fe3dfbdf9c8335dc61f6c79457de609c5c585f1890edac13988d2634730f0dbd06d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi-bash-completion"

RDEPENDS:${PN} += "bash-completion \
python3-kiwi"

inherit rpm
