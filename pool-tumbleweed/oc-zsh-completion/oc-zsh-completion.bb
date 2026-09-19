SUMMARY = "Zsh Completion for oc"
DESCRIPTION = "zsh command line completion support for oc."
LICENSE = "Apache-2.0"

PV = "4.22.0"

RPM_NAME = "oc-zsh-completion-4.22.0-1.3.noarch.rpm"
RPM_HASH = "ac8349c43ab1457fab45946a6c925131d9af0c83e793d88c74f068eac24f0f52058fe48139634192c1af8f60c4d044c43dc5f4009fcf2be6c613893d64e46c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oc-zsh-completion"

RDEPENDS:${PN} += "oc"

inherit rpm
