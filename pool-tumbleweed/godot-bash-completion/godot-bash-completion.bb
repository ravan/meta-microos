SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot and godot-runner"
LICENSE = "MIT"

PV = "4.7.2"

RPM_NAME = "godot-bash-completion-4.7.2-1.1.noarch.rpm"
RPM_HASH = "d8323ac2cd5eb799dd5e8252ba217d1c704c305f047da2278936f20869c77d59ae801547a195afacc3f9f4648f00d492d959979000110d99bdc69363b5ead376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
