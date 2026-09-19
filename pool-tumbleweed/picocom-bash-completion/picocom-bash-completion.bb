SUMMARY = "Bash Completion for picocom"
DESCRIPTION = "Bash completion script for picocom."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "2024.07"

RPM_NAME = "picocom-bash-completion-2024.07-1.8.noarch.rpm"
RPM_HASH = "06384cc478a2040e38072ec46c19260c302a430fed3e4d5def390f97ed1ebe2ca5b949df3806b15bee355f6550a9b0c02db132ae6aa6e2ac067e2e6afe3019be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocom-bash-completion"

RDEPENDS:${PN} += "bash-completion \
picocom"

inherit rpm
