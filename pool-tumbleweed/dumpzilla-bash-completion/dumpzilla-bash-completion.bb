SUMMARY = "Bash Completion for dumpzilla"
DESCRIPTION = "Bash completion script for dumpzilla."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.0+git.20210311"

RPM_NAME = "dumpzilla-bash-completion-0.0.0+git.20210311-1.10.noarch.rpm"
RPM_HASH = "e9577d38ff6d2d130739fc205aa556261bf8b22615a73028ce4ae034430146c7ddfa204292649299edf60aafa8643b74122bab4d851fe734f6464a6cb7920603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dumpzilla-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dumpzilla"

inherit rpm
