SUMMARY = "Zsh Completion for fleet-cli"
DESCRIPTION = "zsh command line completion support for fleet-cli."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "fleet-cli-zsh-completion-0.16.1-1.1.noarch.rpm"
RPM_HASH = "9fe6a95582016dd6a57b043f21e3577e8dbb29d3d4476b03e0fedf17a5df1bb3fbe8a6aeb0ed3b980c9c29832ab5ad556c8eedc3cf7346b6dc204fef8c960f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fleet-cli-zsh-completion"

RDEPENDS:${PN} += "fleet-cli \
zsh"

inherit rpm
