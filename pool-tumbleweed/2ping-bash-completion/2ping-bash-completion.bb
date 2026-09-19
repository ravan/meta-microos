SUMMARY = "Bash completion for 2ping"
DESCRIPTION = "bash command line completion support for 2ping."
LICENSE = "MPL-2.0"

PV = "4.6.1"

RPM_NAME = "2ping-bash-completion-4.6.1-1.2.noarch.rpm"
RPM_HASH = "4a8d00dca24d626ae80481a1bffc8043e906419812551876814faa6b66e32b78f4b72912953b2bfd28859862c96913d2a2222309280a6f74d097258f183455a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "2ping-bash-completion"

RDEPENDS:${PN} += "2ping \
bash-completion"

inherit rpm
