SUMMARY = "Bash Completion for stress-ng"
DESCRIPTION = "Bash completion script for stress-ng."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.00"

RPM_NAME = "stress-ng-bash-completion-0.22.00-1.1.noarch.rpm"
RPM_HASH = "e407686772d98fb100340e659a19c7f3433ac98b5b4b6fe4653e9eec13abdb827a62f8e10841cf9de62e48860905a90d494805ff6d8ac1ad2097f98e6c082444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stress-ng-bash-completion"

RDEPENDS:${PN} += "bash-completion \
stress-ng"

inherit rpm
