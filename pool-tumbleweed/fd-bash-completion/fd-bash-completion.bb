SUMMARY = "Bash Completion for fd"
DESCRIPTION = "The official bash completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "10.4.2"

RPM_NAME = "fd-bash-completion-10.4.2-1.5.noarch.rpm"
RPM_HASH = "59ba1c6cc7f2c783ae38791c31c363d2f70e8e2f90688e93971538521693f3f0354be79af26aa1cfd3dd2b8048ebb59d95ccbf600a9dddf372ac48f32fe711b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
