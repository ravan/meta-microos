SUMMARY = "Zsh Completion for inspektor-gadget"
DESCRIPTION = "zsh command line completion support for inspektor-gadget."
LICENSE = "Apache-2.0"

PV = "0.55.1"

RPM_NAME = "inspektor-gadget-zsh-completion-0.55.1-1.1.noarch.rpm"
RPM_HASH = "11a4a00f6564acd4a181bb36428c70dbdbd56fb4c199ce35c3ea52c1527246bc6fc993f6960769e41bce296e15bb1677b934604f76c3efeb4aaafa6dff2fadc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inspektor-gadget-zsh-completion"

RDEPENDS:${PN} += "inspektor-gadget"

inherit rpm
