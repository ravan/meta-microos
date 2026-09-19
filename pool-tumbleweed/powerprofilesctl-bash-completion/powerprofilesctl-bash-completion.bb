SUMMARY = "Bash completion for powerprofilesctl"
DESCRIPTION = "This package provides bash shell completions for powerprofilesctl."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "powerprofilesctl-bash-completion-0.30-1.7.noarch.rpm"
RPM_HASH = "d58ef553ba4126664022f770ca591a7688d3ea23d9119445b577e3950fb1acf0b9d8083be2a880fecc332dda4c52cdf103a70173b42c48a7428430cf8981cd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerprofilesctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
power-profiles-daemon"

inherit rpm
