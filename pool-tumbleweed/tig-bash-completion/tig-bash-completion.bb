SUMMARY = "Bash completion for tig"
DESCRIPTION = "Bash command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "tig-bash-completion-2.6.1-1.3.noarch.rpm"
RPM_HASH = "9c10f39f9b69d477a4e7a5700f320b0cb1cab30947e8caf5be11fa1cf2394c482b8bdc2db7a56d5f9d716073f99f299aac484ec7d8db327a0e86fdf71f911d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tig"

inherit rpm
