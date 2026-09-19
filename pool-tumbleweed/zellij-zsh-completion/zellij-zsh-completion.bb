SUMMARY = "Zsh Completion for zellij"
DESCRIPTION = "Zsh command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.44.3"

RPM_NAME = "zellij-zsh-completion-0.44.3-1.4.noarch.rpm"
RPM_HASH = "67157d1db8ef9ad5ac27e198b15a5a5d069a5732fd979a09c5f7a11d5d1a3e3622bcc445f9bec8c15d3e6a243bd2284392de955516fb474588047f813fd66221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
