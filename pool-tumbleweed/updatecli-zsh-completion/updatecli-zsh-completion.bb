SUMMARY = "Zsh Completion for updatecli"
DESCRIPTION = "zsh command line completion support for updatecli."
LICENSE = "Apache-2.0"

PV = "0.120.1"

RPM_NAME = "updatecli-zsh-completion-0.120.1-1.1.noarch.rpm"
RPM_HASH = "d914288be8ba762f9cfdbb163218e6256d92cecb83fb2faa930c47326245d12fa5dcf847b0a5784663ac3ed9a7a7c14e6ca3bd1fdac8ae001ea10d6b07181dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "updatecli-zsh-completion"

RDEPENDS:${PN} += "updatecli"

inherit rpm
