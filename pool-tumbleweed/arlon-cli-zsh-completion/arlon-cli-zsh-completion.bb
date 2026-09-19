SUMMARY = "Zsh Completion for arlon-cli"
DESCRIPTION = "zsh command line completion support for arlon-cli."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "arlon-cli-zsh-completion-0.10.0-1.13.noarch.rpm"
RPM_HASH = "0b7da5b701887d5d2d672045d510cc710c0566f46d71926016fc1a0fe7d164abbb049aa9b362f0930bbd619d4b404b76860bc43d9c0758b4fea150ca2eb833d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arlon-cli-zsh-completion"

RDEPENDS:${PN} += "arlon-cli"

inherit rpm
